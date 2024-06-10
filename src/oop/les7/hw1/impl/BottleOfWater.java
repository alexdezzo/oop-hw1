package oop.les7.hw1.impl;

import oop.les7.hw1.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private double volume;
    private String pack;
    private boolean isSpark;


    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = Package.PLASTICK.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean isSpark, double volume, String pack) {
        super(name, price, releaseDate);
        this.isSpark = isSpark;
        this.volume = volume;
        this.pack = pack;
    }


    public double getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}
