package com.andre.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OsApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", System.getenv("PORT")); // Ajusta a porta no Heroku
        SpringApplication.run(OsApplication.class, args);
    }
}
