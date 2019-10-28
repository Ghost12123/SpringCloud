package cn.how2j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务调用者：配置了Feign负载均衡、Hystrix断路由
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FeignHystrixInvoker {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignHystrixInvoker.class).run(args);
    }
}
