package cn.how2j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

/**
 * 服务提供者
 */
@SpringBootApplication
@EnableEurekaClient
public class FirstServiceProvider {
    public static void main(String[] args) {
        //读取控制台输入的端口，避免端口冲突
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入服务提供者端口号(如8081)：");
        String port = sc.nextLine();
        new SpringApplicationBuilder(FirstServiceProvider.class).properties("server.port=" + port).run(args);
    }
}
