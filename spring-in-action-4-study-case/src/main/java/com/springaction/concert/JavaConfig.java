package com.springaction.concert;


import org.springframework.context.annotation.*;

@Configuration
//@EnableAspectJAutoProxy //这里的功能通过XML配置实现了
@ComponentScan
@ImportResource(value = "classpath:/concert.xml")
public class JavaConfig {

    /**
     * 定义Bean
     *
     * 还有另外2个Bean通过xml配置
     * @return
     */


    @Bean
    public AudienceOne audienceOne(){
        return new AudienceOne();
    }
    @Bean
    public AudienceFour audienceFour(){
        return new AudienceFour();
    }
}
