package com.rainbow.learning.dubbo.consumer.cluster;

import com.rainbow.learning.dubbo.api.cluster.FailoverClusterService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class ClusterConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cluster-consumer.xml");
        context.start();
        FailoverClusterService clusterService = (FailoverClusterService) context.getBean("clusterService");

        IntStream.range(0, 20)
                 .forEach(i -> {
                     clusterService.echo("abc");
                     try {
                         Thread.sleep(500);
                     }
                     catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 });
    }
}
