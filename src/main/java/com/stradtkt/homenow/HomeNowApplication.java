package com.stradtkt.homenow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class HomeNowApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeNowApplication.class, args);
    }

}
