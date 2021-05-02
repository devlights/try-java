package com.github.devlights.tryjava.mapping;

import java.util.Map;

import com.github.devlights.tryjava.basic.helloworld.HelloWorld;
import com.github.devlights.tryjava.interfaces.Example;

public final class Builder {
    public static Map<String, Example> build() {
        // TODO: 後々クラス名にして動的生成するべき。try-golangとかtry-csharpを参考に。
        return Map.of("helloworld", new HelloWorld());
    }
}
