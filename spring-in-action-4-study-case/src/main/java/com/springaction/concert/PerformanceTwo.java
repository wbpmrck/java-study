package com.springaction.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceTwo implements Performance {
    public void perform() {
        System.out.println("PerformanceTwo ：进行了一场表演");

    }
}
