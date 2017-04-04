package com.example.intent;

import java.io.Serializable;

/**
 * Created by user on 2017-03-22.
 */

public class Person implements Serializable {
    String name;
    int age;
    Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
