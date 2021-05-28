package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.Set;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (差集合 -- Difference)
 * 
 * REFERENCE:
 * https://stackoverflow.com/questions/393968/java-is-there-an-easy-quick-way-to-and-or-or-xor-together-sets
 * https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html -
 * https://www.atmarkit.co.jp/ait/articles/1906/25/news015_3.html
 */
public final class Difference implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s1 = Set.of("golang", "java");
        var s2 = Set.of("dotnet", "python", "java");

        // Java の Set で 差集合 は removeAll メソッドで生成できる
        var difference = new HashSet<String>();

        difference.addAll(s1);
        difference.removeAll(s2);

        difference.forEach(System.out::println);
    }

}
