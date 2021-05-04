package com.github.devlights.tryjava.basic.fileio.fileread;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("fileio_fileread_6_before", new Java6Before());
        mapper.set("fileio_fileread_6", new Java6());
        mapper.set("fileio_fileread_7", new Java7());
        mapper.set("fileio_fileread_8", new Java8());
        mapper.set("fileio_fileread_11", new Java11());
    }
}
