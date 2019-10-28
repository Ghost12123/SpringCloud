package cn.how2j.client;

import org.springframework.stereotype.Component;

/**
 * 定义断路由Hystrix：当无服务提供者时，将会执行这里
 */
@Component
public class ClientFeignHystrix implements FeignHystrixClient {
    @Override
    public String hello() {
        return "goodbye";
    }

    @Override
    public String router(Integer personId) {
        return "暂无服务提供者！";
    }
}
