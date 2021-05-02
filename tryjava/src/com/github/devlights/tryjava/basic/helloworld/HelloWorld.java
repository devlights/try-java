package com.github.devlights.tryjava.basic.helloworld;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

public class HelloWorld implements Example {
    public void execute() throws ExampleFailedException {
        System.out.println("hello java");
    }
}
