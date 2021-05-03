package com.github.devlights.tryjava.interfaces;

@FunctionalInterface
public interface Finder<T, R> {
    R find(T t);
}
