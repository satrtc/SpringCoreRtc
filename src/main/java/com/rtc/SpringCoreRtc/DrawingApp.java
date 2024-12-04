package com.rtc.SpringCoreRtc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Circle circle=(Circle)context.getBean("circle");
        circle.draw();
    }
}
