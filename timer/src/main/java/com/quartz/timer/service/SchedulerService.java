package com.quartz.timer.service;

import com.quartz.timer.config.TimerInfo;
import com.quartz.timer.util.TimerUtils;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
    private static final Logger LOG = LoggerFactory.getLogger(SchedulerService.class);

    private final Scheduler scheduler;

    @Autowired
    public SchedulerService(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void setScheduler(final Class jobClass, final TimerInfo info){
        final JobDetail jobDetail = TimerUtils.buildJobDetail(jobClass,info);
        final Trigger trigger = TimerUtils.buildTrigger(jobClass,info);

        try{
            scheduler.scheduleJob(jobDetail,trigger);
        }catch (SchedulerException se){
            LOG.error(se.getMessage(),se);
        }
    }

    @PostConstruct
    public void init() {
        try {
            scheduler.start();
        } catch (SchedulerException se) {
            LOG.error(se.getMessage(), se);
        }
    }

    @PreDestroy
    public void preDestoroy() {
        try {
            scheduler.shutdown();
        } catch (SchedulerException se) {
            LOG.error(se.getMessage(), se);
        }
    }


}
