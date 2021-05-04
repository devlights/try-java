package com.github.devlights.tryjava.basic.fileio.fileread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 7 のファイル読み込みのサンプルです。
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
        Path p = Paths.get(Const.FILE_PATH);
        Charset c = StandardCharsets.UTF_8;

        // try-with-resource により close の呼び出しが保証されるようになった
        // (C# の using と同じ感じ)
        try (BufferedReader reader = Files.newBufferedReader(p, c)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioEx) {
            ExampleFailedException ex = new ExampleFailedException(ioEx);
            throw ex;
        }
    }

}