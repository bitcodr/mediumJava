package com.mediumJava.mediumJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MediumJavaApplication {

    public static void main(String[] args) {

        SpringApplication.run(MediumJavaApplication.class, args);
    }

}
