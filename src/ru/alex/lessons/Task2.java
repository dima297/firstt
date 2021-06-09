package ru.alex.lessons;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("aaaaaaaaa", "bbbsssssgs", "aaaaaaaaa", "cccsfgggs");
        int sum = list.stream()
                .filter(value -> value.length() > 8)
                 .collect(Collectors.toSet())
                 .size();

       System.out.println(sum);

        // System.out.println(size);
    }
}
