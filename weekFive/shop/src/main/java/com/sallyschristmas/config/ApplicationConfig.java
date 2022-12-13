package com.sallyschristmas.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.sallyschristmas.entity")
@EnableJpaRepositories(basePackages = "com.sallyschristmas.repo")
public class ApplicationConfig {}
