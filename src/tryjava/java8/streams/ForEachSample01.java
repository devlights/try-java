package tryjava.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * StreamのforEachの動作確認を行います。
 * @author devlights
 */
class ForEachSample01 {

    public static void main(String[] args) {
        makeNumbers().forEach(System.out::println);
    }

    private static List<Integer> makeNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}
