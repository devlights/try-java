package com.github.devlights.tryjava.basic.collections.setop;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("collections_set_create", new Create());
        mapper.set("collections_set_empty", new Empty());
        mapper.set("collections_set_add", new Add());
    }

}
