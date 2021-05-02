package com.github.devlights.tryjava.basic.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 1.1 〜 1.3 までのファイル読み込みのサンプルです。
 * 
 * REFERENCES:
 *   - https://qiita.com/YujiSoftware/items/5975c0a93f5e58f6b9cf
 */
public final class Java14Before implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        var f = new File(Const.FILE_PATH);
        if (!f.exists()) {
            var message = String.format("file not found [%s]\n", Const.FILE_PATH);
            var ex = new ExampleFailedException(message);
            throw ex;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                        new InputStreamReader(
                            new FileInputStream(f), 
                            "UTF-8"));
            
            for (String line = ""; line != null; line = reader.readLine()) {
                System.out.println(line);
            }
        } catch (IOException ioEx) {
            var ex = new ExampleFailedException(ioEx);
            throw ex;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException closeEx) {
                    var ex = new ExampleFailedException(closeEx);
                    throw ex;
                }
            }
        }
    }   
}