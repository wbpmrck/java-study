package com.springaction.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceOne implements Performance {
    public void perform() {
        System.out.println("PerformanceOne ：进行了一场表演");

        //下面这行抛出异常，测试AOP切面
        System.out.println("PerformanceOne ："+2/0);

    }
    public Performance openGate(String when){
        System.out.println("PerformanceOne ：开门了，现在已经是 "+when+" 了");
        return this;
    }
}
