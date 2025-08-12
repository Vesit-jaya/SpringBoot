package com.learn.webproj.config;

import java.util.Optional;

public class AuditorAware<S> implements org.springframework.data.domain.AuditorAware<String> {

@Override
    public Optional<String> getCurrentAuditor()
{
    return Optional.of("jaya");
}
}
