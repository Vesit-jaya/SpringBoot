package com.learn.webproj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAware();
    }
}
