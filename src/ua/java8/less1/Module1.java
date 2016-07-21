package ua.java8.less1;

/**
 * Created by red5 on 7/19/2016.
 */

import java.util.*;
import java.util.function.*;

public class Module1 {
    static String [] words = {"aaa", "bbbb", "11111", "ABC"};
    public static void main(String [] args){

       /* Comparator<String> c = (o1, o2) -> (o1.length() - o2.length());
        Arrays.sort(words, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(words));
        System.out.println(c.getClass());
        boolean lower = false;
        UnaryOperator<String> toLowerCase = String::toLowerCase;
        UnaryOperator<String> toUpperCase = toUpperCase = s->s.toUpperCase();
        UnaryOperator<String> f = lower ? toLowerCase : toUpperCase;



        List<String> wordsList = Arrays.asList(words);
        Consumer<String> p = s -> System.out.println(s);
        wordsList.forEach(p);*/
        //wordsList.forEach(String::);
        class Runner implements Runnable {
            public void run() {
                List<String> wordsList = Arrays.asList(words);
                Consumer<String> p = s -> System.out.println(s);
                //wordsList.forEach(p);
            }
        }

        Runner r1 = new Runner(){
            @Override
            public void run(){
                List<String> wordsList = Arrays.asList(words);
                //wordsList.forEach(System.out::println);
            }
        };
        Runner r2 = new Runner();

        r1.run();
        r2.run();

        Person p1 = new Person(77, "Vasya");
        Person p2 = new Person(15, "Kolya");
        Person p3 = new Person(30, "Ivan");

        Person [] pArr = {p1, p2, p3};
        Arrays.sort(pArr, Person::compareByAge);

        List<String> nList = new ArrayList<>();
        List<Integer> aList = new ArrayList<>();
        //Comparator<Integer> c1 = (o1, o2) -> Integer.compare(o1, o2);
        //Comparator<String> c2 = (o1, o2) -> (o1.length() - o2.length());
        for (int i=0; i< pArr.length; i++){nList.add(pArr[i].pName);}
        for (int i=0; i< pArr.length; i++){aList.add(pArr[i].pAge);}


        //System.out.println(Arrays.toString(pArr));
        //List<Person> nList = Arrays.asList(pArr);
        Consumer<String> p = c -> System.out.println(c);
        Consumer<Integer> a = c -> System.out.println(c);
        //nList.forEach(p);
        aList.forEach(a);

        //Predicate<String> isEmpty = (String s) -> s.isEmpty();
        //Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty =  isEmpty.negate();
        Function<String, Integer> length = String::length;

        System.out.println(isEmpty.test("123"));


    }
}
