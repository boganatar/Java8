package ua.java8.less1;

import java.util.List;

/**
 * Created by red5 on 7/19/2016.
 */
public class Person {
    public Person(String name, Integer age, Person boss, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.boss = boss;
        this.friends = friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getBoss() {
        return boss;
    }

    public void setBoss(Person boss) {
        this.boss = boss;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    private String name;
    private Integer age;
    private Person boss;
    private List<Person> friends;

    Integer pAge;
    String pName;
    public Person (Integer age, String name){
        this.pAge = age;
        this.pName = name;
    }

    public static Integer compareByAge(Person a, Person b){return a.pAge.compareTo(b.pAge);}

    public String getName(){return this.pName;}
}
