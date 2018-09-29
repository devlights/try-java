package tryjava.basic;

// Java 5から静的importが追加された
import static java.lang.System.out;

/**
 * HelloWorldプログラムです。
 * @author devlights
 */
class HelloWorld {

    public static void main(String[] args) {
        var message = "Hello world";
        out.println(message);
    }
}
