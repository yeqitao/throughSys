package com.through;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * MythControllerApplication启动类
 * <p>Title: MythControllerApplication.java</p>
 * @author TAO
 * @date 2019年12月9日
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ThroughControllerApplication {
    public static void main( String[] args ){
        SpringApplication.run(ThroughControllerApplication.class, args);
        
    }
}
