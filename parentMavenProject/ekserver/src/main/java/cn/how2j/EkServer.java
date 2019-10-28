package cn.how2j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EkServer {
    public static void main(String[] args) {
        //读取控制台输入，决定使用哪个profiles
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入决定使用哪个服务器(slave1、slave2)：");
        String profiles = sc.nextLine();
        new SpringApplicationBuilder(EkServer.class).profiles(profiles).run(args);
    }
}
