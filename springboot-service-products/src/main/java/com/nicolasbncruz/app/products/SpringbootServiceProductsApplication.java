package com.nicolasbncruz.app.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class SpringbootServiceProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceProductsApplication.class, args);
    }

}
