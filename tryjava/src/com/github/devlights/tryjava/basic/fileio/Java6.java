package com.github.devlights.tryjava.basic.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java 1.4, 1.5, 6 のファイル読み込みのサンプルです。
 * 
 * REFERENCES:
 *   - https://qiita.com/YujiSoftware/items/5975c0a93f5e58f6b9cf
 */
public final class Java6 implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        File f = new File(Const.FILE_PATH);
        Charset c = Charset.forName("UTF-8");

        if (!f.exists()) {
            String message = String.format("file not found [%s]\n", Const.FILE_PATH);
            ExampleFailedException ex = new ExampleFailedException(message);
            throw ex;
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                        new InputStreamReader(
                            new FileInputStream(f), 
                            c));
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioEx) {
            ExampleFailedException ex = new ExampleFailedException(ioEx);
            throw ex;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException closeEx) {
                    ExampleFailedException ex = new ExampleFailedException(closeEx);
                    throw ex;
                }
            }
        }
    }
}
