package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (int[] から Integer[] への変換)
 * 
 * REFERENCES:
 *   - https://stackoverflow.com/questions/880581/how-to-convert-int-to-integer-in-java
 */
public final class Boxed implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var numbers = new int[]{1, 2, 3};

        //
        // 以下のどちらでも良い
        //
        // 以下で Arrays.deepEquals を呼んでいるが、これは Integer[] になってる
        // ことを確認したいための呼び出し. (Arrays.deepEquals は int[] だとコンパイルエラー)
        //
        var i1 = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        var i2 = IntStream.of(numbers).boxed().toArray(Integer[]::new);

        System.out.printf(
            "numbers: %s\ni1: %s\ni2: %s\ni1 equals i2 = %s\n",
            Arrays.toString(numbers),
            Arrays.toString(i1),
            Arrays.toString(i2),
            Arrays.deepEquals(i1, i2));
    }
    
}
