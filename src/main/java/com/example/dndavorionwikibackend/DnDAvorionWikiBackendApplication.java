package com.example.dndavorionwikibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DnDAvorionWikiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnDAvorionWikiBackendApplication.class, args);
        System.out.println("The username is User");
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
