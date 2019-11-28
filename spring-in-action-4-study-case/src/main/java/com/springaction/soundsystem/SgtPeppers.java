package com.springaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    /**
     * 演示通过Value注解，动态解析Properties文件内容，由Spring注入到参数里
     * 这个功能需要配置 PropertyPlaceholderConfigurer bean
     */
    @Value("${playCD.text}")
    private String title = "Sgt title";


    public void play(String text) {
        if(text == null ||text.isEmpty()){
            System.out.println("Playing:"+title);
        }else{

            System.out.println("Playing:"+text);
        }
    }

    public String makeNoice(){
        return "SgtPeppers noise";
    }
}
