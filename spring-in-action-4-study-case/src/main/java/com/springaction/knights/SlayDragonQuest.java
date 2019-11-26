package com.springaction.knights;

import java.io.PrintStream;

/**
 * 实现一个杀龙的探险类
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(String knightName) {
        stream.println("the knight["+knightName+"] slay the dragon!!");

    }
}
