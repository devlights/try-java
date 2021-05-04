package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (配列のコピー)
 */
public final class Copy implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // 手動
        //
        var ints1 = new int[]{1, 2, 3};
        
        var ints2 = new int[ints1.length];
        for (var i = 0; i < ints1.length; i++) {
            ints2[i] = ints1[i];
        }

        for (var i = 0; i < ints1.length; i++) {
            System.out.printf("int1: %d\tints2: %d\n", ints1[i], ints2[i]);
        }

        //
        // Arrays.copyOf() を利用 (Java 6 から追加されたメソッド)
        //
        var ints3 = Arrays.copyOf(ints1, ints1.length);
        
        for (var i = 0; i < ints1.length; i++) {
            System.out.printf("int1: %d\tints3: %d\n", ints1[i], ints3[i]);
        }
    }
    
}
