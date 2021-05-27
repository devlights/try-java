package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (条件に合致した要素の削除)
 */
public final class RemoveIf implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s = new HashSet<String>();

        Stream.of("go", "golang", "java", "dotnet", "python", "flutter").forEach(s::add);
        System.out.println(s.stream().collect(Collectors.toList()));

        s.removeIf(e -> e.startsWith("go"));
        System.out.println(s.stream().collect(Collectors.toList()));
    }

}
