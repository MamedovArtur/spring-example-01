package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class AppConfig {

    @Bean
    HttpClient httpClient(){
        return HttpClient.newBuilder().build();
    }

}
