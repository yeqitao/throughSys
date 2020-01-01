package com.through;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * EurekaServerApplication启动类
 * <p>Title: EurekaServerApplication.java</p>
 * @author TAO
 * @date 2019年12月9日
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
    public static void main( String[] args ){
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
