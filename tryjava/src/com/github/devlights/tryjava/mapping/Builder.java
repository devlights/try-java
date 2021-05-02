package com.github.devlights.tryjava.mapping;

import java.util.Map;

import com.github.devlights.tryjava.basic.helloworld.HelloWorld;
import com.github.devlights.tryjava.interfaces.Example;

public final class Builder {
    public static Map<String, Example> build() {
        return Map.of("helloworld", new HelloWorld());
    }
}
