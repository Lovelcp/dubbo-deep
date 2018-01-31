package com.rainbow.learning.dubbo.provider.load_balance.random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomLBProvider2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("dubbo.protocol.port", "20881");
        System.setProperty("dubbo.provider.weight", "200");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("load_balance/random-lb-provider.xml");
        context.start();
        Thread.currentThread()
              .join();
    }
}
