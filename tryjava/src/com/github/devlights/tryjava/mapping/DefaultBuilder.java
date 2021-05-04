package com.github.devlights.tryjava.mapping;

import com.github.devlights.tryjava.interfaces.Builder;
import com.github.devlights.tryjava.interfaces.Mapper;

public final class DefaultBuilder implements Builder {

    @Override
    public Mapper build() {
        var mapper = new DefaultMapper();

        (new com.github.devlights.tryjava.basic.helloworld.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.fileio.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.measure.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.collections.Examples()).regist(mapper);

        return mapper;
    }
}
