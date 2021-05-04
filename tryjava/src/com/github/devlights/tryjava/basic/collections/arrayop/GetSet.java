package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (要素の取得と設定)
 */
public final class GetSet implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // 要素の取得と設定は他の言語と同じ.
        // インデックスは 0 始まり.
        //
        var ints = new int[]{1, 2, 3, 4, 5};

        System.out.printf("[index:0] %d\n", ints[0]);
        
        ints[0] = 100;
        Arrays.stream(ints).forEach(System.out::println);
    }
    
}
