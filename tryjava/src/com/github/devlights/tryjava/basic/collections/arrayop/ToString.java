package com.github.devlights.tryjava.basic.collections.arrayop;

import java.util.Arrays;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * 配列についてのサンプルです. (文字列表現)
 */
public final class ToString implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var languages = new String[]{"Golang", "CSharp", "Java"};

        //
        // 配列を文字列で表示する場合は Arrays.toString() が便利
        //
        System.out.println(Arrays.toString(languages));
    }
    
}
