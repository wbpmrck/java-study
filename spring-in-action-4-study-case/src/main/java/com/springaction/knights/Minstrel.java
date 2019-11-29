package com.springaction.knights;

import java.io.PrintStream;

/**
 * 吟游诗人类，此类用作AOP切面
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    /**
     * 在骑士Quest方法调用之前调用
     */
    public void singBeforeQuest(){
        stream.println("[AOP]la la la,the knight is so brave!");
    }

    /**
     * 骑士Quest之后调用
     */
    public void singAfterQuest(){
        stream.println("[AOP]la la la,the knight finish a quest!");
    }
}
