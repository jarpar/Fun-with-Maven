package io.github.mat3e;

import java.util.Optional;

public class HelloService {
    String prepareGreeting(String name) {
        Optional.ofNullable(name).orElse("world");


        return null;
    }

}
