package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (指定した要素を含むか確認)
 */
public final class Contains implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s = new HashSet<String>();

        Stream.of("go", "golang", "java", "dotnet", "python", "flutter").forEach(s::add);
        System.out.println(s.stream().collect(Collectors.toList()));

        var found = s.contains("java");
        System.out.printf("contains java? [%s]\n", found);
        found = s.contains("C++");
        System.out.printf("contains C++? [%s]\n", found);
    }

}
