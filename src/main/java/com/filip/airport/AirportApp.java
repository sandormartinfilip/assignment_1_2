package com.filip.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by sandof on 10/20/2017.
 */
@SpringBootApplication
public class AirportApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AirportApp.class, args);
    }
}
