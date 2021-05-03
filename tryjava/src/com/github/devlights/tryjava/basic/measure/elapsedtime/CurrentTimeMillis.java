package com.github.devlights.tryjava.basic.measure.elapsedtime;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * system.currentTimeMillis() を使ったサンプルです.
 * 
 * REFERENCES:
 *   - https://www.baeldung.com/java-measure-elapsed-time
 *   - https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/System.html#currentTimeMillis()
 */
public final class CurrentTimeMillis implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java の 初期から存在するメソッド.
        //
        var start = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (IllegalArgumentException | InterruptedException threadEx) {
            var ex = new ExampleFailedException(threadEx);
            throw ex;
        } finally {
            var end = System.currentTimeMillis();
            System.out.printf("Elapsed: %d ms\n", (end - start));
        }
    }
    
}