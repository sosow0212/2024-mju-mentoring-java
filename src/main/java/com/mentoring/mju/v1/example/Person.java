package com.mentoring.mju.v1.example;

public class Person {

    private final String name;
    private final String name2;
    private int age;


    public String getName2() {
        return name2;
    }

    public Person(String name, String name2, int age) {
        this.name = name;
        this.name2 = name2;
        this.age=age;

    }

//
//    public Person(final String name, final int age) {
//        this.name = name;
//        this.age = age;
//    }

    public IllegalAccessException exceptionAge(){
        this.age++;
        if(this.age>=30) {

        }
        throw new IllegalArgumentException();
    }
    public void change(){
        this.name.toLowerCase();

    }
    public void addAge() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
