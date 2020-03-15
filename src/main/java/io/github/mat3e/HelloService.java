package io.github.mat3e;

import java.util.Optional;

public class HelloService {
    static final String FALLBACK_NAME = "world";
    static final Lang FALLBACK_LANG = new Lang(1L, "Hello", "en");

    String prepareGreeting(String name) {
        return prepareGreeting(name, FALLBACK_LANG.getId());
    }

    String prepareGreeting(String name, Long langId) {
        return "Hello " + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
        
    }
}
