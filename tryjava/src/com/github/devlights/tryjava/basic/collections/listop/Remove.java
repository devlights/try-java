package com.github.devlights.tryjava.basic.collections.listop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (要素の削除)
 * 
 */
public final class Remove implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        Consumer<List<Integer>> fn = v -> {
            var s = v.stream().map(i -> Integer.toString(i)).collect(Collectors.toList());
            System.out.println(String.join(",", s));
        };

        var l = new ArrayList<Integer>();
        IntStream.range(0, 6).forEach(l::add);
        fn.accept(l);

        // 指定インデックスの要素を削除
        var removed = l.remove(l.size() - 1);
        fn.accept(l);
        System.out.printf("remove: %d\n", removed);

        // 指定したオブジェクトに合致する要素を削除
        var didRemove = l.remove(Integer.valueOf(1));
        fn.accept(l);
        System.out.printf("remove: %s\n", didRemove);

        // 全要素削除
        l.clear();
        fn.accept(l);
    }

}
