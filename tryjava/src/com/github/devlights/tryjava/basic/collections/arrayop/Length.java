package com.github.devlights.tryjava.basic.collections.arrayop;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (配列の長さ)
 */
public final class Length implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // 配列の長さは length プロパティから取得できる.
        // (メソッドではないことに注意. 逆に List の方は size() メソッドとなる.)
        //
        var ints = new int[]{1, 2, 3};
        System.out.printf("Length: %d\n", ints.length);
    }
    
}
