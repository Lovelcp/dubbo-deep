package com.rainbow.learning.dubbo.provider.cluster;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClusterProvider1 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cluster-provider.xml");
        context.start();
        Thread.currentThread()
              .join();
    }
}
