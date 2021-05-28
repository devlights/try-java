package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.Set;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (積集合 -- Intersection)
 * 
 * REFERENCE:
 * https://stackoverflow.com/questions/393968/java-is-there-an-easy-quick-way-to-and-or-or-xor-together-sets
 * https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
 * https://www.atmarkit.co.jp/ait/articles/1906/25/news015_3.html
 */
public final class Intersection implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s1 = Set.of("golang", "java");
        var s2 = Set.of("dotnet", "python", "java");

        // Java の Set で 積集合 は retainAll メソッドで生成できる
        var intersect = new HashSet<String>();

        intersect.addAll(s1);
        intersect.retainAll(s2);

        intersect.forEach(System.out::println);
    }

}
