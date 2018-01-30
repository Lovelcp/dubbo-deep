package com.rainbow.learning.dubbo.provider.cache;

import com.rainbow.learning.dubbo.api.cache.CacheService;

import java.util.concurrent.atomic.AtomicInteger;

public class CacheServiceImpl implements CacheService {
    private final AtomicInteger i = new AtomicInteger();

    public String findCache(String id) {
        return "request: " + id + ", response: " + i.getAndIncrement();
    }
}
