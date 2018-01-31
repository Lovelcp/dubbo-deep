package com.rainbow.learning.dubbo.provider.load_balance.roundrobin;

import com.rainbow.learning.dubbo.api.load_balance.LBService;

import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLBServiceImpl implements LBService {
    private static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public String echo(String msg) {
        System.out.println("Receive msg, counter: " + counter.incrementAndGet());
        return msg;
    }
}
