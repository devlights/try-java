package com.github.devlights.tryjava.basic.collections.listop;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (条件に合致する要素の削除)
 * 
 */
public final class RemoveIf implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        Consumer<List<String>> fn = v -> {
            System.out.println(String.join(",", v));
        };

        var l = new LinkedList<String>();

        l.add("go");
        l.add("golang");
        l.add("java");
        l.add("dotnet");
        l.add("python");
        l.add("flutter");

        fn.accept(l);

        // Java 8 からは List#removeIf メソッドが追加された
        var didRemoveSomething = l.removeIf(e -> e.startsWith("g"));
        fn.accept(l);
        System.out.printf("removed: %s\n", didRemoveSomething);
    }

}
