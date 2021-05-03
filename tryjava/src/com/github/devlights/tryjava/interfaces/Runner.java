package com.github.devlights.tryjava.interfaces;

@FunctionalInterface
public interface Runner<T> {
    void run(T name);
}
