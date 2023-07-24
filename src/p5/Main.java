package p5;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, -4, -5);
        //numbers.sorted().takeWhile(n->n<0).forEach(System.out::println);

        //numbers.sorted().dropWhile(n->n<0).forEach(System.out::println);

        Stream<String> people1 = Stream.of("Ivan", "Alex", "Nickolay");
        Stream<String> people2 = Stream.of("Maria", "Natasha", "Katya");

       // Stream.concat(people1, people2).forEach(System.out::println);

        Stream<String> people = Stream.of("Ivan", "Alex", "Nickolay", "Alex", "Natasha", "Katya");
        people.distinct().forEach(System.out::println);

    }

}
