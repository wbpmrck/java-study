package com.springaction;

import com.springaction.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/knights.xml");
        Knight knight1 = context.getBean(Knight.class);
        knight1.embarkOnQuest();
        context.close();
    }
}
