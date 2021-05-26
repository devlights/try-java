package com.github.devlights.tryjava.basic.collections;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        (new com.github.devlights.tryjava.basic.collections.arrayop.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.collections.listop.Examples()).regist(mapper);
        (new com.github.devlights.tryjava.basic.collections.setop.Examples()).regist(mapper);
    }
    
}
