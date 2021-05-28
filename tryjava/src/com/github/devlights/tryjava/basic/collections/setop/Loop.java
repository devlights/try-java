package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (ループ)
 */
public final class Loop implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s = new HashSet<String>();
        Stream.of("go", "java", "dotnet", "python", "flutter").forEach(s::add);

        // for-each
        for (var e : s) {
            System.out.println(e);
        }

        System.out.printf("\n\n");

        // forEach method
        s.forEach(System.out::println);
    }

}
