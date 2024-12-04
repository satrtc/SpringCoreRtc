package com.rtc.SpringCoreRtc;


import org.springframework.beans.factory.annotation.Autowired;

public class Triangle  {
    public Point pointA;
    public Point pointB;
    public Point pointC;

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
    @Autowired
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
        System.out.println("Bean initilised");
    }

    public void destroy()
    {
        System.out.println("Bean destroyed");
    }
}
