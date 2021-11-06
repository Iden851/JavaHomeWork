package com.pb.ivanov.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String woolColor;

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    @Override
    public void makeNoise() {

        System.out.println(getWoolColor() + " кот мяукает");
    }

    @Override
    public void eat() {

        System.out.println(getWoolColor() + " кот ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(woolColor, cat.woolColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(woolColor);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "woolColor='" + woolColor + '\'' +
                '}';
    }
}
