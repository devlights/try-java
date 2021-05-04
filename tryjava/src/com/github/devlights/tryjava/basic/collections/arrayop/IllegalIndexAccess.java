package com.github.devlights.tryjava.basic.collections.arrayop;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (不正なインデックスアクセスについて)
 */
public final class IllegalIndexAccess implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // 不正なインデックス、つまり、範囲外のインデックスにアクセスすると
        // 実行時に ArrayIndexOutOfBoundsException が発生する
        //
        var ints = new int[]{1, 2, 3};
        try {
            ints[100] = 100;
        } catch (ArrayIndexOutOfBoundsException arrEx) {
            System.out.println(arrEx.getMessage());
        }
    }
    
}
