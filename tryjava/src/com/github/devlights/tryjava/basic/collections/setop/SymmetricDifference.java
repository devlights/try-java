package com.github.devlights.tryjava.basic.collections.setop;

import java.util.HashSet;
import java.util.Set;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Set のサンプルです. (対称差 -- Symmetric Difference)
 * 
 * <div>
 * <span>REFERENCE:</span>
 * <ul>
 * <li> https://stackoverflow.com/questions/393968/java-is-there-an-easy-quick-way-to-and-or-or-xor-together-sets </li>
 * <li> https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html </li>
 * <li> https://www.atmarkit.co.jp/ait/articles/1906/25/news015_3.html </li>
 * </ul>
 * </div>
 */
public final class SymmetricDifference implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var s1 = Set.of("golang", "java");
        var s2 = Set.of("dotnet", "python", "java");

        // Java の Set で 対称差 は 以下のように複数のメソッドを呼び出して生成する
        var symmetricDiff = new HashSet<String>();

        // まず 和集合 を作る
        symmetricDiff.addAll(s1);
        symmetricDiff.addAll(s2);

        // 次に 積集合 を求める
        var intersection = new HashSet<String>();

        intersection.addAll(s1);
        intersection.retainAll(s2);

        // 最後に 上で求めた 積集合 を引く
        symmetricDiff.removeAll(intersection);

        symmetricDiff.forEach(System.out::println);
    }

}
