package com.springaction.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceThree implements Performance {
    public void perform() {
        System.out.println("PerformanceThree ：进行了一场表演");

    }

    /**
     * 这个方法为了演示带参数和返回值的切点
     * @param when
     * @return
     */
    public Performance openGate(String when){
        System.out.println("PerformanceThree ：开门了，现在已经是 "+when+" 了");
        return this;
    }
}
