package com.github.devlights.tryjava.basic.measure.elapsedtime;

import java.time.Duration;
import java.time.Instant;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Example;

/**
 * Java8 で追加された java.time パッケージのクラスを用いたサンプルです.
 * 
 * REFERENCES:
 *   - https://www.baeldung.com/java-measure-elapsed-time
 *   - https://www.ne.jp/asahi/hishidama/home/tech/java/datetime.html
 *   - https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/time/package-summary.html
 */
public final class InstantAndDuration implements Example {

    @Override
    public void execute() throws ExampleFailedException {
        //
        // Java 8 で 追加された java.time パッケージの
        //   - Instant
        //   - Duration
        // を使った経過時間の算出方法
        //
        var start = Instant.now();
        try {
            Thread.sleep(3000);
        } catch (IllegalArgumentException | InterruptedException threadEx) {
            var ex = new ExampleFailedException(threadEx);
            throw ex;
        } finally {
            var d = Duration.between(start, Instant.now());
            System.out.printf("Elapsed: %d ms\n", d.toMillis());
        }

    }
    
}
