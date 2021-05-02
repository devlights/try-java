package com.github.devlights.tryjava.basic.helloworld;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("helloworld", new HelloWorld());
    }
}
