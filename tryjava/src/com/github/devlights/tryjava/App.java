package com.github.devlights.tryjava;

import java.util.Scanner;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.mapping.Builder;

public class App {

    Mapper mapper;

    public App() {
        this.mapper = Builder.build();
    }

    public void run(String name) {
        var target = this.mapper.get(name);
        if (target == null) {
            return;
        }

        try {
            target.execute();
        } catch (ExampleFailedException failed) {
            System.err.println(failed.getMessage());            
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
