package com.study_share.study_share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class StudyShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyShareApplication.class, args);
    }

}
