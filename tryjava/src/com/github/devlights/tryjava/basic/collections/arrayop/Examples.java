package com.github.devlights.tryjava.basic.collections.arrayop;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("collections_array_create", new Create());
        mapper.set("collections_array_getset", new GetSet());
        mapper.set("collections_array_length", new Length());
        mapper.set("collections_array_illegal_index", new IllegalIndexAccess());
        mapper.set("collections_array_loop", new Loop());
        mapper.set("collections_array_copy", new Copy());
    }
    
}