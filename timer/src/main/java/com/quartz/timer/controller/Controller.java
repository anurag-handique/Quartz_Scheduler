package com.quartz.timer.controller;


import com.quartz.timer.service.PlaygroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/timer")
public class Controller {


    private final PlaygroundService playgroundService;

    @Autowired
    public Controller(PlaygroundService playgroundService) {
        this.playgroundService = playgroundService;
    }

    @PostMapping("/run_job")
    public void runJob() {
        playgroundService.runJob();
    }
}
