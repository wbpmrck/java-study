package com.springaction.concert;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 第4种观众类，只演示获取切点函数的参数和返回值
 */
@Aspect
public class AudienceFour {

    /**
     * 为了复用切点，这里通过Pointcut定一个空方法，这样后续的切点定义可以直接使用
     */
    @Pointcut("execution(com.springaction.concert.Performance com.springaction.concert.PerformanceThree.openGate(String)) && args(when)")
    public void openGate(String when){}

    @Before("openGate(when)")
    public void beforeOpenGate(String when){
        System.out.println("AudienceFour:等待开门："+when);
    }
    @AfterReturning(pointcut = "openGate(when)",returning = "ret")
    public void beforeOpenGate(String when,Performance ret){
        System.out.println("AudienceFour: "+when+" 终于开门咯,准备演出");
        ret.perform();
    }

//    @Around("openGate(when)")
//    public void watchOpenGate(String when,ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//
//        System.out.println("AudienceFour:等待开门："+when);
//        try{
//            Object[] arg = new Object[1];
//            arg[0] = when;
//            PerformanceThree ret = (PerformanceThree)proceedingJoinPoint.proceed(arg);//调用被代理的目标方法
//            System.out.println("AudienceFour:开门了，冲啊");
//            ret.perform(); //开始演出
//        }catch(Throwable err){
//            System.out.println("AudienceFour:怎么还不开!");
//            throw err;
//        }
//
//    }
}
