package com.pb.ivanov.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String destiny;

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    @Override
    public void makeNoise() {
        System.out.println(getDestiny() + " лощадь фыркает");
    }

    @Override
    public void eat() {
        System.out.println(getDestiny() + " лошадь ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(destiny, horse.destiny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destiny);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "destiny='" + destiny + '\'' +
                '}';
    }
}
