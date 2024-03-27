package com.quartz.timer.jobs;

import com.quartz.timer.config.TimerInfo;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class HelloWorldJob implements Job {

    /**
     * Give a Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

//        LOG.info("Hello From Quartz!!");
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        TimerInfo info = (TimerInfo) jobDataMap.get(HelloWorldJob.class.getSimpleName());
        LOG.info(info.getCallbackData());

    }
}
