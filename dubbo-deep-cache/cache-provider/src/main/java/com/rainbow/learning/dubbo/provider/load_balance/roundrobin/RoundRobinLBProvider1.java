package com.rainbow.learning.dubbo.provider.load_balance.roundrobin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoundRobinLBProvider1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("dubbo.parameter.warmup", "0");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("load_balance/roundrobin-lb-provider.xml");
        context.start();
        Thread.currentThread()
              .join();
    }
}
