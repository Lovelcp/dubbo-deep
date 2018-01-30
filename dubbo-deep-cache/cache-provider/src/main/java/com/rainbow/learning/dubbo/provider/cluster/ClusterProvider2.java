package com.rainbow.learning.dubbo.provider.cluster;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClusterProvider2 {
    public static void main(String[] args) throws Exception {
        System.setProperty("dubbo.protocol.port", "20881");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cluster-provider.xml");
        context.start();
        Thread.currentThread()
              .join();
    }
}
