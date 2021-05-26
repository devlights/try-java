package com.github.devlights.tryjava.basic.collections.listop;

import java.util.LinkedList;
import java.util.stream.IntStream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (要素の取得)
 * 
 */
public final class Get implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var l = new LinkedList<Integer>();
        IntStream.range(0, 5).forEach(l::add);

        // 範囲外の要素にアクセスすると IndexOutOfBoundsException が発生する
        try {
            l.get(99);
        } catch (IndexOutOfBoundsException indexEx) {
            System.out.printf("index error: %s\n", indexEx.toString());
        }
    }
    
}
