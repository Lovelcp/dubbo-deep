package com.rainbow.learning.dubbo.provider.cache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CacheProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cache-provider.xml");
        context.start();
        Thread.currentThread()
              .join();
    }
}
