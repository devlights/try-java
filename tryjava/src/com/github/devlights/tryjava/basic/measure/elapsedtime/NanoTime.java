package com.github.devlights.tryjava.basic.measure.elapsedtime;

import java.util.function.BiFunction;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * system.nanoTime() を使ったサンプルです.
 * 
 * REFERENCES:
 *   - https://www.baeldung.com/java-measure-elapsed-time
 *   - https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/System.html#currentTimeMillis()
 */
public final class NanoTime implements Example {

    BiFunction<Long, Long, Long> toMillisec = (s, e) -> ((e - s)/1000000);

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java 1.5 から追加されたメソッド. あまり使うことがない.
        // 
        // ナノ秒をミリ秒にするには 1000000 で割る.
        //
        var start = System.nanoTime();
        try {
            Thread.sleep(3000);
        } catch (IllegalArgumentException | InterruptedException threadEx) {
            var ex = new ExampleFailedException(threadEx);
            throw ex;
        } finally {
            var ms = this.toMillisec.apply(start, System.nanoTime());
            System.out.printf("Elapsed: %d ms\n", ms);
        }
        
    }
    
}
