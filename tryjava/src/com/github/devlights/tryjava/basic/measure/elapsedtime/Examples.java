package com.github.devlights.tryjava.basic.measure.elapsedtime;

import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Register;

public final class Examples implements Register {

    @Override
    public void regist(Mapper mapper) {
        mapper.set("elapsedtime_currenttimemillis", new CurrentTimeMillis());
        mapper.set("elapsedtime_nanotime", new NanoTime());
        mapper.set("elapsedtime_instant_and_duration", new InstantAndDuration());
    }
    
}
