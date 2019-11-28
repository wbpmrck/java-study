package com.springaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//这是一个用于开启Spring的AutoScan功能的配置类。默认Spring会扫描和配置类同package的类
@Configuration
@ComponentScan
@PropertySource("classpath:/app.properties")
public class CDPlayerConfig {

    /**
     * 这个Bean是为了让Spring支持读取属性文件，然后自动注入到Bean里
     * @return
     */
    @Bean
    public  static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
