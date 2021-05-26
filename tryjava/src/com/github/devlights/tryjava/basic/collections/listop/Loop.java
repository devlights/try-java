package com.github.devlights.tryjava.basic.collections.listop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

public final class Loop implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var l = Arrays.asList("go", "golang", "java", "dotnet", "python", "flutter");

        // 昔ながらのやり方
        for (var i = 0; i < l.size(); i++) {
            System.out.printf("%s ", l.get(i));
        }
        System.out.println("");

        // for-each
        for (var e : l) {
            System.out.printf("%s ", e);
        }
        System.out.println("");

        // forEach メソッド
        l.forEach(e -> System.out.printf("%s ", e));
        System.out.println("");
    }

}