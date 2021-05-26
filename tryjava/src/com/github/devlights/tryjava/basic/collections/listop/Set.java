package com.github.devlights.tryjava.basic.collections.listop;

import java.util.LinkedList;
import java.util.stream.IntStream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (要素の変更)
 * 
 */
public final class Set implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var l = new LinkedList<Integer>();
        IntStream.range(0, 3).forEach(l::add);

        // 範囲外の要素にアクセスすると IndexOutOfBoundsException が発生する
        try {
            l.set(0, 99);
            l.forEach(System.out::println);

            l.set(99, 0);
            l.forEach(System.out::println);
        } catch (IndexOutOfBoundsException indexEx) {
            System.out.printf("index error: %s\n", indexEx.toString());
        }
    }

}
