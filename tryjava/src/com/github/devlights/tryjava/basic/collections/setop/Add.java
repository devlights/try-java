package com.github.devlights.tryjava.basic.collections.setop;

import java.util.LinkedHashSet;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (要素の追加)
 */
public final class Add implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        // 要素の追加は Set#add で行う
        // Set は 集合 なので、同じ要素を何回追加しても一つのみとなる
        var s = new LinkedHashSet<String>();

        Stream.of("hello", "world", "hello", "world", "hello").forEach(s::add);
        s.forEach(System.out::println);
    }

}
