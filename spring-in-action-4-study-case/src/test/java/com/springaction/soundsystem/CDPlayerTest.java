package com.springaction.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;
    @Autowired
    private SgtPeppers2 sgtPeppers2;

    @Autowired
    Environment env;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    /**
     * 演示通过Enviroment来获取外部配置的properties文件里的参数
     */
    @Test
    public void playCD(){
        cd.play(env.getProperty("playCD.text"));
    }

    @Test
    public void playCD2(){
        //执行会输出12345，因为SgtPeppers通过Value注入了配置信息
        cd.play(null);
    }
    @Test
    public void makeNoise(){
        assertEquals("SGTPEPPERS NOISE 3.141592653589793",sgtPeppers2.makeNoice());
        ;
    }
}
