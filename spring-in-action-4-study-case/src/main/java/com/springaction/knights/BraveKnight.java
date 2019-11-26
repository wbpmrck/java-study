package com.springaction.knights;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

/**
 * 一个勇敢骑士类，里面并不指定具体的Quest类
 */
public class BraveKnight implements Knight,BeanNameAware,DisposableBean {

    private Quest quest;
    private String name;

    public  BraveKnight(Quest quest){
        this.quest = quest;
    }
    /**
     * 调用探险类进行探险
     */
    public void embarkOnQuest() {
        quest.embark(name);
    }

    /**
     * 实现 BeanNameAware接口，测试Spring的Bean的声明周期
     * @param s
     */
    public void setBeanName(String s) {
        name = s;
    }

    /**
     * 实现 DisposeableBean 的接口，完成销毁（在ApplicationContext 销毁的时候，会自动调用）
     * @throws Exception
     */
    public void destroy() throws Exception {
        System.out.println(name+" is destroyed !");
    }
}
