package com.github.devlights.tryjava.basic.collections.setop;

import java.util.Collections;
import java.util.Set;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです。 (空のSet)
 */
public final class Empty implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        // 空の Set は、Collections#emptySet で取得できる
        Set<String> empty = Collections.emptySet();

        // この Set は 不変 なので、変更しようとすると例外が発生する
        try {
            empty.add("hello");
        } catch (UnsupportedOperationException notSupportEx) {
            System.out.printf("Exception: %s\n", notSupportEx);
        }
    }

}
