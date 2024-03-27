package com.quartz.timer.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimerInfo {
    private int TotalFireCount;
    private boolean runForever;
    private long repeatIntervalMs;
    private long initialOffsetMs;
    private String callbackData;

}
