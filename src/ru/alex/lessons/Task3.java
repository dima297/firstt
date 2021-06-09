package ru.alex.lessons;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "aaa", 123,
                "bbb", 333,
                "fff", 555,
                "kkk", 888
        );
        int sum = map.entrySet()
                .stream()
                .filter(e -> e.getKey().length() < 8)
                .mapToInt(value -> value.getValue().intValue())
                .sum();
        System.out.println(sum);
    }
}
