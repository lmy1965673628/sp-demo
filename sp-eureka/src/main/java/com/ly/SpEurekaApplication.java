package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpEurekaApplication.class, args);
    }

}
