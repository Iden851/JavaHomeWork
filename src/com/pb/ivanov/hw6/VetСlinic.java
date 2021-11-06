package com.pb.ivanov.hw6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
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

        Veterinarian veterinarian = new Veterinarian();


       Animal[] arr = new Animal[]{dog,cat,horse};
        for (Animal a: arr){
            veterinarian.treatAnimal(a);
        }

//        Animal anim = new Animal();
//        Class clazz = anim.getClass();
//        System.out.println(clazz.getName());
//        System.out.println(Arrays.toString(clazz.getMethods()));
//
//        Class VeterinarianClazz = Class.forName("hw6.Veterinarian");
//
//        // создание объекта через рефлексию
//        Constructor constr = VeterinarianClazz.getConstructor(new Class[] {String.class});
//        Object obj = constr.newInstance("Лабрадор");
//        if (obj instanceof Veterinarian) {
//            ((Veterinarian) obj).eat;
//        }


    }
}
