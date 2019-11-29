package com.springaction.concert;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 这是一个POJO,演示通过AspectJ语法定义切面
 */
@Aspect
public class AudienceOne {

    @Before("execution(* com.springaction.concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("AudienceOne:关闭手机");
    }

    @Before("execution(* com.springaction.concert.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("AudienceOne:做到位置上");
    }
    @AfterReturning("execution(* com.springaction.concert.Performance.perform(..))")
    public void applause(){
        System.out.println("AudienceOne:鼓掌-- CLAP CLAP CLAP!");
    }
    @AfterThrowing("execution(* com.springaction.concert.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("AudienceOne:要求退款!");
    }
}
