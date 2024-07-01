package com.bench.consumer;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.bench.demo.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author bench
 * @Date 2024/06/25 21:13
 **/
@RestController
@RequestMapping("/dubbo")
public class ConsumerController {

//    这个地方直接就向Nacos中注册了一个DubboService的服务
    @NacosInjected
    @DubboReference
    private DemoService demoService;

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        String msg = demoService.sayHello("bench");
        System.out.println(msg);

        // 使用 ResponseEntity 返回 JSON 格式的字符串
        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"" + msg + "\"}");
    }

}
