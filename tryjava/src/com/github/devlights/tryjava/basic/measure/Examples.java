package com.github.devlights.tryjava.basic.measure;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        (new com.github.devlights.tryjava.basic.measure.elapsedtime.Examples()).regist(mapper);
    }
    
}
