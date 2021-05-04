package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (生成について)
 */
public final class Create implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // 配列の生成 (new)
        //
        // 値は初期値となる。
        //
        var ints1 = new int[5];

        System.out.println("[ints1]");
        Arrays.stream(ints1).forEach(System.out::println);

        //
        // 要素指定して生成
        //
        var ints2 = new int[]{1, 2, 3, 4, 5};

        System.out.println("[ints2]");
        Arrays.stream(ints2).forEach(System.out::println);
    }
}
