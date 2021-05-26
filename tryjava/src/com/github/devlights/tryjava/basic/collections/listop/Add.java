package com.github.devlights.tryjava.basic.collections.listop;

import java.util.LinkedList;
import java.util.stream.IntStream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (要素の追加)
 * 
 */
public final class Add implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var l = new LinkedList<Integer>();

        IntStream.range(0, 4).forEach(l::add);

        // 末尾に追加
        l.add(10);
        // インデックスを指定して追加
        l.add(2, 11);
        // 先頭に追加
        l.add(0, 99);
        
        l.forEach(System.out::println);
    }
    
}
