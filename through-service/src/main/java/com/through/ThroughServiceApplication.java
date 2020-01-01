package com.through;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * MythServiceApplication启动类
 * <p>Title: MythServiceApplication.java</p>
 * @author TAO
 * @date 2019年12月9日
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ThroughServiceApplication {
    public static void main( String[] args ){
        SpringApplication.run(ThroughServiceApplication.class, args);
    }
}
