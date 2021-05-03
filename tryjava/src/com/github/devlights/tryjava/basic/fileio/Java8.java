package com.github.devlights.tryjava.basic.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 8 のファイル読み込みのサンプルです。
 * 
 * REFERENCES:
 *   - https://qiita.com/YujiSoftware/items/5975c0a93f5e58f6b9cf
 */
public final class Java8 implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java 8 にて stream が導入されたことにより更に楽になった.
        // (C# の LINQ みたいな感じ)
        //
        // また、java.nio.file.Files に lines メソッドが追加されたことにより
        // ファイルからの stream 取得も一発で行える.
        //
        // Files.lines にて内部でオープンされているファイルは
        // stream が閉じる際にクローズされるようになっている.
        //
        try (Stream<String> stream = Files.lines(Paths.get(Const.FILE_PATH))) {
            stream.forEach(System.out::println);
        } catch (IOException ioEx) {
            ExampleFailedException ex = new ExampleFailedException(ioEx);
            throw ex;
        }
    }
}
