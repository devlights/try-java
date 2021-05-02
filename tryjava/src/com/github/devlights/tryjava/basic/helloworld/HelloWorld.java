package com.github.devlights.tryjava.basic.helloworld;

import com.github.devlights.tryjava.interfaces.Example;

public class HelloWorld implements Example {
    public boolean execute() {
        System.out.println("hello java");
        return true;
    }
}
