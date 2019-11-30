package com.springaction.concert;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 第三种观众类，通过环绕通知来进行AOP
 */
@Aspect
public class AudienceThree {

    /**
     * 为了复用切点，这里通过Pointcut定一个空方法，这样后续的切点定义可以直接使用
     */
    @Pointcut("execution(* com.springaction.concert.Performance.perform(..))")
    public void performanceCall(){}

    @Around("performanceCall()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("AudienceThree:关闭手机");
        System.out.println("AudienceThree:做到位置上");
        try{
            proceedingJoinPoint.proceed();//调用被代理的目标方法
            System.out.println("AudienceThree:鼓掌-- CLAP CLAP CLAP!");
        }catch(Throwable err){
            System.out.println("AudienceThree:要求退款!");
            throw err;
        }


    }
}
