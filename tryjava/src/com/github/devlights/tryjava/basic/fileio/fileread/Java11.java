package com.github.devlights.tryjava.basic.fileio.fileread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 11 のファイル読み込みのサンプルです。
 * 
 * REFERENCES:
 *   - https://qiita.com/YujiSoftware/items/5975c0a93f5e58f6b9cf
 */
public final class Java11 implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java8 から大きな流れは変わっていないが
        //   - Path.of メソッドが追加
        //   - Java10から追加された型推論
        // などの細かい機能改善があり、更に見やすくなっている
        //
        try (var lines = Files.lines(Path.of(Const.FILE_PATH))) {
            lines.forEach(System.out::println);
        } catch (IOException ioEx) {
            var ex = new ExampleFailedException(ioEx);
            throw ex;
        }
    }
    
}
