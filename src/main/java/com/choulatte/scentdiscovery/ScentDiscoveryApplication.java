package com.choulatte.scentdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScentDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScentDiscoveryApplication.class, args);
    }

}
