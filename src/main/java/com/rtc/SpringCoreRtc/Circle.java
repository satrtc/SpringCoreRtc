package com.rtc.SpringCoreRtc;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Circle {

    Point center;

    public Point getCenter() {
        return center;
    }

@Resource(name = "point1")
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw()
    {
        System.out.println("Circle drawn");
        System.out.println("center point|"+"x:"+center.getX()+" y:"+center.getY());
    }

    //lifecycle methods created by user
    @PostConstruct
    public void initCircle()
    {
        System.out.println("Circle Bean initialised");
    }

    @PreDestroy
    public void destroyCircle()
    {
        System.out.println("Circle Bean initialisation phase destroyed");
    }

}
