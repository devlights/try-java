package com.github.devlights.tryjava.interfaces;

import java.util.Set;

public interface Mapper {
    Example get(String name);
    void set(String name, Example target);
    Set<String> keys();
}
