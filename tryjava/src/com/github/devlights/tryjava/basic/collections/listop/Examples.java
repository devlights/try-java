package com.github.devlights.tryjava.basic.collections.listop;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("collections_list_create", new Create());
        mapper.set("collections_list_empty", new Empty());
        mapper.set("collections_list_add", new Add());
        mapper.set("collections_list_get", new Get());
        mapper.set("collections_list_set", new Set());
        mapper.set("collections_list_remove", new Remove());
    }
    
}
