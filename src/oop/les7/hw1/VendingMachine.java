package oop.les7.hw1;

import oop.les7.hw1.impl.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    //Конструктор
    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    //Конструктор
    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    //метод добавления продукта
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    //метод "выдачи" продукта по его имени
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("No such product " + name);
        return null;

    }

    // метод нахождения продукта по его определенным параметрм
    public Product getProduct(String name, float volume, int temp) {
        for (Product product : products) {
            // проверка на принадлежность объекта к определенному классу
            if (product instanceof HotDrink) {
                HotDrink result = (HotDrink) product;
                if (result.getName().equals(name) && result.getVolume() == volume && result.getTemp() == temp) {
                    products.remove(result);
                    System.out.println("Drink: " + "'" + product.getName() + "'" + " has been found");
                    return result;
                }
            }
        }
        System.out.println("The drink was not found!");
        return null; // В случае если продукт не найден
    }


    public List<Product> getProducts() {
        return products;
    }

}
