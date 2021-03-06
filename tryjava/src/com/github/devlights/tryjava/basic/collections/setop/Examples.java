package com.github.devlights.tryjava.basic.collections.setop;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("collections_set_create", new Create());
        mapper.set("collections_set_empty", new Empty());
        mapper.set("collections_set_add", new Add());
        mapper.set("collections_set_loop", new Loop());
        mapper.set("collections_set_remove", new Remove());
        mapper.set("collections_set_removeif", new RemoveIf());
        mapper.set("collections_set_contains", new Contains());
        mapper.set("collections_set_union", new Union());
        mapper.set("collections_set_difference", new Difference());
        mapper.set("collections_set_intersection", new Intersection());
        mapper.set("collections_set_symmetric_difference", new SymmetricDifference());
    }

}
