package com.springaction.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceTwo implements Performance {
    public void perform() {
        System.out.println("PerformanceTwo ：进行了一场表演");

    }
    public Performance openGate(String when){
        System.out.println("PerformanceTwo ：开门了，现在已经是 "+when+" 了");
        return this;
    }
}
