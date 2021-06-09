package ru.alex.lesson;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        long max = strings.stream()
                .map(x -> x + x)

                .map(x -> Integer.valueOf(x))
                .filter(x -> x % 2 == 0)

                .sorted()
                .mapToInt(x -> x.intValue())
                //       .mapToObj(x ->Integer.valueOf(x))
                .summaryStatistics()
                .getSum();
        System.out.println(max);


        int sum = Stream.of(12, 34)
                .mapToInt(x -> x.intValue())
                //.forEach(x1 -> System.out.println(x1));
                .sum();
        System.out.println(sum);
        int sum1 = IntStream.of(22, 33)
                .peek(System.out::println)
                .sum();
        System.out.println(sum1);
        Stream.of(sum1)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .map(x->x+2)
                .forEach(System.out::println);



//
//        IntStream.of(2,3,4,5,6,7)
//                .mapToObj(v->String.valueOf(v))
//                .peek(System.out::println)
//                .forEach(System.out::println);
    }

}
