package cn.how2j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.Scanner;

/**
 * 网关zuul：配置了服务提供者和调用者的zuul网关
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class Zuul {
    public static void main(String[] args) {
        //读取控制台输入的端口，避免端口冲突
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入网关端口号(如9010)：");
        String port = sc.nextLine();
        new SpringApplicationBuilder(Zuul.class).properties("server.port=" + port).run(args);
    }
}
