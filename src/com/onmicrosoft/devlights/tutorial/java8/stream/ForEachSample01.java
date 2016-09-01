package com.onmicrosoft.devlights.tutorial.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * StreamのforEachの動作確認を行います。
 * @author devlights
 */
public class ForEachSample01 {

    public static void main(String[] args) {
        makeNumbers().stream().forEach(item -> System.out.println(item));
    }

    static List<Integer> makeNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}
