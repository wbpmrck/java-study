package com.springaction.concert;


import org.aspectj.lang.annotation.*;

/**
 * 这是一个POJO,演示通过AspectJ语法定义切面
 */
@Aspect
public class AudienceTwo {

    /**
     * 为了复用切点，这里通过Pointcut定一个空方法，这样后续的切点定义可以直接使用
     */
    @Pointcut("execution(* com.springaction.concert.Performance.perform(..))")
    public void performanceCall(){}

    @Before("performanceCall()")
    public void silenceCellPhones(){
        System.out.println("AudienceTwo:关闭手机");
    }

    @Before("performanceCall()")
    public void takeSeats(){
        System.out.println("AudienceTwo:做到位置上");
    }
    @After("performanceCall()")
    public void applause(){
        System.out.println("AudienceTwo:鼓掌-- CLAP CLAP CLAP!");
    }
    @AfterThrowing("performanceCall()")
    public void demandRefund(){
        System.out.println("AudienceTwo:要求退款!");
    }
}
