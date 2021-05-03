package com.github.devlights.tryjava;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.github.devlights.tryjava.exceptions.ExampleFailedException;
import com.github.devlights.tryjava.interfaces.Finder;
import com.github.devlights.tryjava.interfaces.Mapper;
import com.github.devlights.tryjava.interfaces.Runner;
import com.github.devlights.tryjava.mapping.Builder;

public class App implements Runner<String>, Finder<String, List<String>> {

    Mapper mapper;

    public App() {
        this.mapper = Builder.build();
    }

    @Override
    public List<String> find(String t) {
        var keys = this.mapper.keys();
        var target = t.toLowerCase();

        var fullmatch = 
                keys.stream()
                    .filter(s -> target.equals(s))
                    .findFirst();

        if (fullmatch.isPresent()) {
            return Arrays.asList(fullmatch.get());
        }

        var candidates = 
                keys.stream()
                    .filter(s -> s.contains(target))
                    .collect(Collectors.toList());

        return candidates;
    }

    @Override
    public void run(String name) {
        var target = this.mapper.get(name);
        if (target == null) {
            return;
        }

        var start = Instant.now();
        try {
            System.out.printf("[Name] %s\n\n", name);
            System.out.println("|------ BEGIN -----|");

            target.execute();

        } catch (ExampleFailedException failed) {
            System.err.println(failed.getMessage());            
        } finally {
            System.out.println("|------  END  -----|");

            var elapsed = Duration.between(start, Instant.now());
            System.out.printf("\n[Elapsed] %s ms\n", elapsed.toMillis());
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

                var candidates = app.find(target);
                if (candidates.size() == 0) {
                    continue;
                }

                if (candidates.size() > 1) {
                    System.out.printf("There is %d candidates.\n\n", candidates.size());
                    
                    for (var candidate : candidates) {
                        System.out.println(candidate);
                    }

                    // 出力を見やすくするための改行
                    System.out.println("");

                    continue;
                }

                // There is only 1 candidate. Execute it.
                app.run(candidates.get(0));
            }
        }
    }
}
