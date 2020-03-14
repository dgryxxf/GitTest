package com.company;

/**
 * @author tinyBee
 * @date 2020/3/13 14:20
 * @Description
 */
public class Dog extends Animal {
    private String country;
    Dog(String name, int age,String  country) {
        super(name, age);
        this.country = country;
    }
    public void say(){
        System.out.println("This is "+getName()+" Dog");
    }
}
