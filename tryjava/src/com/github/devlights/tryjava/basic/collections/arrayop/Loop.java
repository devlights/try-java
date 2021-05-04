package com.github.devlights.tryjava.basic.collections.arrayop;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (ループ)
 */
public final class Loop implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var ints = new int[]{1, 2, 3};

        for (var i = 0; i < ints.length; i++) {
            System.out.printf("for-loop: %d\n", ints[i]);
        }

        for (var v : ints) {
            System.out.printf("foreach-loop: %d\n", v);
        }
    }
    
}
