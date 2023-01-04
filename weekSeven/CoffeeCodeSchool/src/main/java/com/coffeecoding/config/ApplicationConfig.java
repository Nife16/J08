package com.coffeecoding.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.coffeecoding.repo")
@EntityScan(basePackages="com.coffeecoding.entity")
public class ApplicationConfig {
    
}
