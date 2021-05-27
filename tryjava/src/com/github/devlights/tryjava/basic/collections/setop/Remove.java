package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (要素の削除)
 */
public final class Remove implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s = new HashSet<String>();

        Stream.of("go", "java", "dotnet", "python", "flutter").forEach(s::add);
        this.print(s);

        s.remove("java");
        this.print(s);
    }

    private void print(Set<String> s) {
        System.out.printf("%s\n", s.stream().collect(Collectors.toList()));
    }
}
