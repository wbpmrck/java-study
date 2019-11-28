package com.springaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers2 {

    /**
     * 演示SpEL表达式，引用其他bean的方法
     */
    @Value("#{sgtPeppers.makeNoice()?.toUpperCase()}")
    private String noise;


    public String makeNoice(){
        return noise;
    }
}
