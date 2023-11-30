package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
    @Bean(value = "mongoBean")
    public MongoClient mongoClient(@Value("${spring.data.mongodb.username}") String username,
                                   @Value("${spring.data.mongodb.password}")    String password,
                                   @Value("${spring.data.mongodb.port}")    Integer port,
                                   @Value("${spring.data.mongodb.dataBase}")    String dataBase){
        return MongoClients.create(String.format("mongodb://%s:%s@localhost:%s/%s",username,password,port,dataBase ));
    }
}