package com.practice.basics.OopsConcept;

import org.checkerframework.checker.units.qual.C;

public class overridingConcept {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
       Animal d = new Dog();
       Animal c= new Cat();
       d.sound();
       c.sound();
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat MEOWS");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Makes sound");
    }
}
