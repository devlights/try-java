package com.github.devlights.tryjava.basic.collections.listop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * リストについてのサンプルです. (リストの新規作成)
 * 
 */
public final class Create implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        // ArrayList
        //   内部構造で配列を利用しているため、要素の読み出しは高速.
        //   要素の追加と削除は、要素の移動を伴うため、要素数が多いと遅くなる.
        List<String> l1 = new ArrayList<>();
        // LinkedList
        //   内部構造でリンクリストを利用しているため、要素の読み出しは
        //   先頭と末尾は速いが、中央付近になればなるほど時間が掛かる.
        //   要素の追加と削除は、リンクの付け替えだけで済むので効率的.
        List<String> l2 = new LinkedList<>();

        l1.add("hello");
        l1.add("world");
        l2.add("world");
        l2.add("hello");

        for (var e : l1) {
            System.out.println(e);
        }

        l2.forEach(System.out::println);
    }

}