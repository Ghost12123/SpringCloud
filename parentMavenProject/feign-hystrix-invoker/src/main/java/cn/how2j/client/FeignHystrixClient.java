package cn.how2j.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign客户端负载均衡：当有多个服务提供者时，将负载均衡调用任一个
 */
@FeignClient(value = "FIRST-CLOUD-PROVIDER", fallback = ClientFeignHystrix.class)
public interface FeignHystrixClient {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/person/{personId}")
    String router(@PathVariable("personId") Integer personId);
}
