package com.github.devlights.tryjava.mapping;

import com.github.devlights.tryjava.interfaces.Mapper;

public final class Builder {
    public static Mapper build() {
        var mapper = new DefaultMapper();

        (new com.github.devlights.tryjava.basic.helloworld.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.fileio.Examples()).regist(mapper);

        return mapper;
    }
}
