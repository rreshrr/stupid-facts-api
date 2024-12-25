package ru.thomaskohouse.StupidFactsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StupidFactsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StupidFactsApiApplication.class, args);
    }

}
