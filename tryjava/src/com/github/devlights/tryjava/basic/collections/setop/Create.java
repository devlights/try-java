package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです。 (Set の生成)
 */
public final class Create implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        // HashSet
        //   内部構造に HashMap を利用しているSetの実装
        //   要素の追加と削除は高速. 要素の順序性はない.
        //
        // LinkedHashSet
        //   内部構造にリンクリストを利用しているSetの実装
        //   順序性を持っている. LinkedListのように双方向アクセスは出来ない
        var s1 = new HashSet<String>();
        var s2 = new LinkedHashSet<String>();

        Stream.of("go", "golang", "java", "dotnet", "python", "flutter").forEach(v -> {
            Stream.of(s1, s2).forEach(s -> s.add(v));
        });

        Stream.of(s1, s2).forEach(s -> {
            s.forEach(v -> System.out.printf("%s ", v));
            System.out.printf("\n");
        });
    }

}