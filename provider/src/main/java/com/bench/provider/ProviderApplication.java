package com.bench.provider;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author bench
 * @Date 2024/06/24 09:21
 **/

@SpringBootApplication
@EnableDubbo
@NacosPropertySource(dataId = "nacos-config", autoRefreshed = true, type = ConfigType.YAML)
//@NacosConfigurationProperties(dataId = "nacos-config.yml", autoRefreshed = true, type = ConfigType.YAML)
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
