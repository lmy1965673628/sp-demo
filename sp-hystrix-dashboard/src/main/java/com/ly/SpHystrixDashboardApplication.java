package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class SpHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpHystrixDashboardApplication.class, args);
    }
}