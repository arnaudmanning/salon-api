package com.arsalon.salonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties()
public class SalonApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalonApiApplication.class, args);
    }

}
