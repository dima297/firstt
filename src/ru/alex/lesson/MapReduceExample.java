package ru.alex.lesson;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {

        Optional<Student> mayBeStudent = Stream.of(
                new Student(25, "alex"),
                new Student(15, "alex15"),
                new Student(27, "alex")
        )
                //  .parallel()
                // .map(x->x.getAge())
                .filter(student -> student.getAge() < 24)
                .reduce((x, x1) -> x.getAge() > x1.getAge() ? x : x1);
        mayBeStudent.map(student -> student.getAge())

                .flatMap(d -> Optional.of(d * 2))
                .ifPresent(System.out::println);


        //    .forEach(System.out::println);


        //  System.out.println(mayBeStudent.get().getName());


    }
}
