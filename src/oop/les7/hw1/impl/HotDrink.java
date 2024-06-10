package oop.les7.hw1.impl;


import oop.les7.hw1.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    private int temp;
    private float volume;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temp = 60;
        this.volume = 0.3F;
    }


    public HotDrink(String name, double price, LocalDate releaseDate, int temp, float volume) {
        super(name, price, releaseDate);
        this.temp = temp;
        this.volume = volume;
    }


    public int getTemp() {
        return temp;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", temp=" + temp +
                ", volume=" + volume +
                '}';
    }


}
