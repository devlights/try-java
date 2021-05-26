package com.github.devlights.tryjava.basic.collections.listop;

import java.util.Collections;
import java.util.List;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (空のリスト)
 * 
 */
public final class Empty implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var empty = this.getList();
        var empty2 = this.getList();

        System.out.printf("size: %d\n", empty.size());
        System.out.printf("%d %d\n", empty.hashCode(), empty2.hashCode());
    }
    
    private List<String> getList() {
        return Collections.emptyList();
    }
}
