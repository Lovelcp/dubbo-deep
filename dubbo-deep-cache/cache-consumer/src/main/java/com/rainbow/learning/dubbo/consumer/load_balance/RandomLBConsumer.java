package com.rainbow.learning.dubbo.consumer.load_balance;

import com.rainbow.learning.dubbo.api.load_balance.LBService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class RandomLBConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lb-consumer.xml");
        context.start();
        LBService lbService = context.getBean("lbService", LBService.class);

        IntStream.range(0, 200)
                 .forEach(i -> {
                     lbService.echo("abc");
                     try {
                         Thread.sleep(500);
                     }
                     catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 });
    }
}
