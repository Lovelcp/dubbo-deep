package com.rainbow.learning.dubbo.provider.cluster;

import com.rainbow.learning.dubbo.api.cluster.FailoverClusterService;

public class ClusterServiceImpl implements FailoverClusterService {
    @Override
    public String echo(String msg) {
        System.out.println("receive msg");
        return msg;
    }
}
