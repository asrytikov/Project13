package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

       /* ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Paris", "Moscow", "London");
        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter(s->s.length()==6);
        citiesStream.forEach(s -> System.out.println(s));
        long number = citiesStream.count();
        System.out.println(number);*/

        Stream<String> citiesStream = Arrays.stream(new String[]{"Paris", "Moscow", "London"});
        citiesStream.forEach(s -> System.out.println(s));

        IntStream intStream = Arrays.stream(new int[]{1,2,3});
        intStream.forEach(s -> System.out.println(s));

        String[] cities = {"Paris", "Moscow", "London"};
        Stream<String> citiesStr = Stream.of(cities);
        citiesStr.forEach(System.out::println);

        IntStream intStream1 = IntStream.of(1,2,3);
        intStream1.forEach(s -> System.out.println(s));


    }

}
