package com.github.devlights.tryjava.basic.fileio;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("fileio_14_before", new Java14Before());
    }
}
