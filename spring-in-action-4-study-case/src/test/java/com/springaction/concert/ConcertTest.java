package com.springaction.concert;

import com.springaction.soundsystem.CDPlayerConfig;
import com.springaction.soundsystem.CompactDisc;
import com.springaction.soundsystem.SgtPeppers2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class ConcertTest {

    @Autowired
    private Performance performance;

    @Test
    public void performance(){
        performance.perform();
    }
}
