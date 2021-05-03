package com.github.devlights.tryjava.mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.github.devlights.tryjava.interfaces.Example;
import com.github.devlights.tryjava.interfaces.Mapper;

public final class DefaultMapper implements Mapper {

    Map<String, Example> mappings;

    public DefaultMapper() {
        this.mappings = new HashMap<String, Example>();
    }

    @Override
    public Example get(String name) {
        if (!this.mappings.containsKey(name)) {
            return null;
        }

        return this.mappings.get(name);
    }

    @Override
    public void set(String name, Example target) {
        if (this.mappings.containsKey(name)) {
            return;
        }

        this.mappings.put(name, target);
    }

    @Override
    public Set<String> keys() {
        return this.mappings.keySet();
    }

}
