package com.pb.ivanov.hw6;

import com.pb.ivanov.hw3.Array;

public class VetСlinic {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.setBreed("Лабрадор");
        dog.setLocation("Харьков");
        dog.setFood("Сухой корм");
        dog.makeNoise();
        dog.eat();

        Cat cat = new Cat();
        cat.setWoolColor("Рыжий");
        cat.setLocation("Киев");
        cat.setFood("Консервы");
        cat.makeNoise();
        cat.eat();

        Horse horse = new Horse();
        horse.setDestiny("Ездовая");
        horse.setLocation("Львов");
        horse.setFood("Сено");
        horse.makeNoise();
        horse.eat();

        Array Animals = new Animal(){};


    }
}
