package com.drinks.erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.drinks.erp.datasource.mappers")
@ServletComponentScan
@EnableScheduling
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        System.out.println("启动成功");
/*
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Environment environment = context.getBean(Environment.class);
        System.out.println("启动成功，后端服务API地址：http://" + ComputerInfo.getIpAddr() + ":"
                + environment.getProperty("server.port") + "/drinks-boot/doc.html");
        System.out.println("您还需启动前端服务，启动命令：yarn run serve 或 npm run serve，测试用户：jsh，密码：123456");
*/
    }
}
