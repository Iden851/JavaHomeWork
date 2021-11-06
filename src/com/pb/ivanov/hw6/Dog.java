package com.pb.ivanov.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;


    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    @Override
    public void makeNoise() {

        System.out.println(getBreed() + " скулит");
    }

    @Override
    public void eat() {

        System.out.println(getBreed() + " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
