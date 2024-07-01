package com.bench.provider;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.bench.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author bench
 * @Date 2024/06/24 09:17
 **/
//    这个地方直接就向Nacos中注册了一个DubboService的服务
@DubboService
public class DemoServiceImpl implements DemoService {

    @NacosValue(value = "${creator.name}", autoRefreshed = true)
    private String nacosName;

    @NacosValue(value = "${server.port}", autoRefreshed = true)
    private String url;

    @Value(value = "${server.port}")
    private String port;

    @Override
    public String sayHello(String name) {
        return port + ":" + nacosName + " say hello to :" + name;
    }
}
