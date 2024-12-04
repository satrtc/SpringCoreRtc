package com.rtc.SpringCoreRtc;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {
    public Point pointA;
    public Point pointB;
    public Point pointC;
    public ApplicationContext context;
    public void draw()
    {
        System.out.println("Triangle drawn");
        System.out.println("point A|"+"x:"+pointA.getX()+" y:"+pointA.getY());
        System.out.println("point B|"+"x:"+pointB.getX()+" y:"+pointB.getY());
        System.out.println("point C|"+"x:"+pointC.getX()+" y:"+pointC.getY());
    }

    public Point getPointA() {
        return pointA;
    }

    //using autowire annotation to set the point property
    @Autowired @Qualifier("originPoint")
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    //implemented lifecycle methods
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean initialised");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean disposed");
//    }

    //lifecycle methods created by user
    public void init()
    {
        System.out.println("Triangle Bean phase initialised");
    }

    public void destroy()
    {
        System.out.println("Triangle Bean initialisation phase destroyed");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }
}
