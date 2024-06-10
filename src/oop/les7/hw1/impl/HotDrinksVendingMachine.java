package oop.les7.hw1.impl;

import oop.les7.hw1.Product;
import oop.les7.hw1.VendingMachine;

import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {

    public HotDrinksVendingMachine() {
        super();
    }

    public HotDrinksVendingMachine(List<Product> products) {
        super(products);
    }
}
