package com.github.devlights.tryjava.interfaces;

public interface Mapper {
    Example get(String name);
    void set(String name, Example target);
}
