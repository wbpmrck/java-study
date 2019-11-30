package com.springaction.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class ConcertTest {

    @Autowired
    @Qualifier("performanceOne")
    private Performance performance1;

    @Autowired
    @Qualifier("performanceTwo")
    private Performance performance2;

    @Autowired
    @Qualifier("performanceThree")
    private Performance  performance3;

    @Test
    public void performance1(){
        performance1.perform();
    }
    @Test
    public void performance2(){
        performance2.perform();
    }
    @Test
    public void performance3(){
        performance3.openGate("星期一");
    }
}
