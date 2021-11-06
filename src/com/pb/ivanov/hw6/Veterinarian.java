package com.pb.ivanov.hw6;

public class Veterinarian extends Animal {


    public void treatAnimal(Animal animal){
        System.out.println("На приеме ветеринара: " + animal + '\n' +
                "Питание: " + animal.getFood() + '\n' +
                "Город: " + animal.getLocation());
    }
}
