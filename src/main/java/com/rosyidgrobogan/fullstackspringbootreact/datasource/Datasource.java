package com.rosyidgrobogan.fullstackspringbootreact.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Datasource {

//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public HikariDataSource hikariDataSource() {
//        System.out.println("konfigurasi hikari");
//        return DataSourceBuilder
//                .create()
//                .type(HikariDataSource.class)
//                .build();
//    }
}
