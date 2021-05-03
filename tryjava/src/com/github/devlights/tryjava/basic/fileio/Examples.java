package com.github.devlights.tryjava.basic.fileio;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("fileio_6_before", new Java6Before());
        mapper.set("fileio_6", new Java6());
        mapper.set("fileio_7", new Java7());
    }
}
