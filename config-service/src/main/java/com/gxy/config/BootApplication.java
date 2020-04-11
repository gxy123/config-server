package com.gxy.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @version 1.0
 * @author:  guoxiaoyu
 * @date : 2018/11/13
 */
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@EnableConfigServer
@EnableDiscoveryClient
@ComponentScan("com.gxy")
public class BootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BootApplication.class);
        application.run(args);
    }

    @Override
    public void run(String... args) {
    }
}