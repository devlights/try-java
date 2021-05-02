package com.github.devlights.tryjava;

import java.util.Map;
import java.util.Scanner;

import com.github.devlights.tryjava.interfaces.Example;
import com.github.devlights.tryjava.mapping.Builder;

public class App {

    Map<String, Example> mappings;

    public App() {
        this.mappings = Builder.build();
    }

    public void run(String name) {
        if (!this.mappings.containsKey(name)) {
            return;
        }

        var target = this.mappings.get(name);
        if (!target.execute()) {
            System.err.println("Error!");
        }
    }

    public static void main(String[] args) throws Exception {
        var app = new App();

        // 出力を見やすくするための改行
        System.out.println("");

        try (var scanner = new Scanner(System.in)) {
            for (;;) {
                System.out.print("ENTER EXAMPLE NAME: ");

                var target = scanner.nextLine();
                if (target.toLowerCase().equals("quit")) {
                    break;
                }

                app.run(target);
            }
        }
    }
}
