package ru.alex.lessons;

import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 15, 25, 34, 45, 66);
        OptionalDouble average = integers.stream()
                .filter(x -> x % 2 != 0)
                .filter(x -> x % 5 == 0)
                // .map(x->x.intValue())

                .mapToInt(x -> x.intValue())
                .average();
      average.ifPresent(System.out::println);




    }
}
