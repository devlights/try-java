package com.github.devlights.tryjava.basic.fileio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 1.7 〜 のファイル読み込みのサンプルです。
 * 
 * REFERENCES:
 *   - https://qiita.com/YujiSoftware/items/5975c0a93f5e58f6b9cf
 */
public final class Java7 implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java 7 から グッと楽に書けるようになっている
        //
        var p = Paths.get(Const.FILE_PATH);
        var c = StandardCharsets.UTF_8;

        // try-with-resource により close の呼び出しが保証されるようになった
        // (C# の using と同じ感じ)
        try (var reader = Files.newBufferedReader(p, c)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioEx) {
            var ex = new ExampleFailedException(ioEx);
            throw ex;
        }
    }

}