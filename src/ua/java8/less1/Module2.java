package ua.java8.less1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by red5 on 7/21/2016.
 */
public class Module2 {
    public static void main(String [] args){
        Stream<Object> numbers = Stream.of(1,2,3, "a");
        String [] words = {"abs", "XYZ", "test", "ABC", "123456"};
        Stream<String> stream = Stream.of(words);
        Stream<Double> doubleStream = Stream.generate(() -> Math.random()).limit(10);

        Stream<Person> persons = PersonHelper.getPersons().stream();
        IntStream is = IntStream.of(1, 2,3);

/*        persons.map((Person p) -> p.getAge())
                .filter((Integer age) -> age > 25)
                .peek(System.out::println)
                .flatMapToInt((Integer age) -> IntStream.of(age))
                //.forEach(System.out::println);
                .average().ifPresent(System.out::println);*/

/*
        IntStream is = persons.peek(System.out::println)
                .map((Person p) -> p.getAge())
                .filter((Integer age) -> age > 25)
                .peek(System.out::println)
                .flatMapToInt((Integer age) -> IntStream.of(age))
                //.forEach(System.out::println);
                .average().ifPresent(System.out::println);
*/
        IntStream intStream = persons
                //.peek(System.out::println)
                .map((Person p) -> p.getAge())
                //.peek((a) -> {
                //    System.out.println(a + " " + Thread.currentThread().getName());
                //})
                .filter((Integer age) -> age > 25)
                //.peek(System.out::println)
                .flatMapToInt((Integer age) -> IntStream.of(age))
                .peek(System.out::println);

        System.out.println(is.average().getAsDouble());

        persons = PersonHelper.getPersons().parallelStream();
        //persons.max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        //intStream.average().ifPresent(System.out::println);
        persons.map(p -> p.getAge()).reduce(0, (a1, a2) -> a1 + a2);
        System.out.println(intStream.average().getAsDouble());


    }
}
