package com.springaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers2 {

    /**
     * 演示SpEL表达式:
     * 引用其他bean的方法
     * T使用类型信息
     */
    @Value("#{sgtPeppers.makeNoice()?.toUpperCase() +' '+ T(java.lang.Math).PI.toString()}")
    private String noise;


    public String makeNoice(){
        return noise;
    }
}
