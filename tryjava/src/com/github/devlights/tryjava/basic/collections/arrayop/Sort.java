package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (ソート)
 */
public final class Sort implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var languages = new String[]{"Go", "Rust", "Java", "CSharp", "Python"};

        //
        // Arrays.sort() は 破壊的操作 であるので注意.
        // 元の配列の中身が直接ソートされる.
        //
        System.out.printf("before: %s\n", Arrays.toString(languages));
        Arrays.sort(languages);
        System.out.printf("after : %s\n", Arrays.toString(languages));

        //
        // Stream.sorted() を利用することも出来る.
        // こちらは 非破壊的操作 となる.
        //
        var before = new String[]{"Go", "Rust", "Java", "CSharp", "Python"};
        var after = Arrays.stream(before).sorted().toArray(String[]::new);

        System.out.printf("before: %s\n", Arrays.toString(before));
        System.out.printf("after : %s\n", Arrays.toString(after));
    }
    
}
