package com.example.commongateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient

@EnableEurekaClient
public class CommonGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonGatewayApplication.class, args);
    }

}
