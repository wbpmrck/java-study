package com.springaction.soundsystem;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//这是一个用于开启Spring的AutoScan功能的配置类。默认Spring会扫描和配置类同package的类
@Configuration
@ComponentScan
//这个注解，和xml里的功能一样，这里是演示2者都可以工作
//@PropertySource("classpath:/app.properties")
@ImportResource("classpath:/soundsystem.xml")
public class CDPlayerConfig {

    /**
     * 这个Bean是为了让Spring支持读取属性文件，然后自动注入到Bean里
     *
     *
     * PS:如果把这个方法注释掉，则需要在soundsystem.xml里增加相关配置
     */
//    @Bean
//    public  static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
