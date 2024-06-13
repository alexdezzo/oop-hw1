package oop.les7.hw1;

import oop.les7.hw1.impl.*;
import oop.les7.hw1.impl.Package;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product hotDrink1 = new HotDrink("Капучино", 123, LocalDate.now());
        Product hotDrink2 = new HotDrink("Латте", 230, LocalDate.of(2024, 06, 3), 88, 0.4F);


        VendingMachine hvm = new HotDrinksVendingMachine();

        hvm.addProducts(List.of(hotDrink1, hotDrink2));

        System.out.println(hvm.getProducts());

        hvm.getProduct("Капучино", 0.3F, 60);
//
        System.out.println(hvm.getProducts());

//        Product bottle1 = new BottleOfWater("Родники", 32, LocalDate.of(2024, 4, 1));
//        Product bottle2 = new BottleOfWater("РодникиРоссии", 40, LocalDate.now(), true, 0.5, Package.GLASS.getMaterial());

//        VendingMachine vm = new WaterVendingMachine();

//        System.out.println(vm.getProducts());
//
//        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));
//        System.out.println(vm.getProducts());
//
//        vm.getProduct("РодникиРоссии");
//        System.out.println(vm.getProducts());


    }
}
