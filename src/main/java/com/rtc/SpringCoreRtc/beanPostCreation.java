package com.rtc.SpringCoreRtc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class beanPostCreation implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("bean name1:"+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean name2:"+beanName);

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
