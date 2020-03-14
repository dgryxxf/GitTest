package com.company;

/**
 * @author tinyBee
 * @date 2020/3/13 14:17
 * @Description
 */
public class Animal implements TalkAnimal{
    private String name;
    private int age;

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

    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void say(){
        System.out.println("This is animal!");
    }
}
