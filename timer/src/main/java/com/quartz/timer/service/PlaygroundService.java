package com.quartz.timer.service;


import com.quartz.timer.config.TimerInfo;
import com.quartz.timer.jobs.HelloWorldJob;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PlaygroundService {

    private final SchedulerService schedulerService;


    public PlaygroundService(SchedulerService schedulerService) {
        this.schedulerService = schedulerService;
    }

    public void runJob(){
        final TimerInfo info = new TimerInfo();
        info.setTotalFireCount(10);
        info.setRepeatIntervalMs(3000);
        info.setInitialOffsetMs(1000);
        info.setCallbackData("This is a custom message from Quartz Scheduler");

        schedulerService.setScheduler(HelloWorldJob.class,info);
    }
}
