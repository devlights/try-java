package com.github.devlights.tryjava.interfaces;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;

@FunctionalInterface
public interface Example {
    void execute() throws ExampleFailedException;
}
