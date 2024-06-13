package oop.hw2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human vasya = new Human("Василий");
        Human petya = new Human("Петя");
        Human galina = new Human("Галина");
        Human igor = new Human("Игорь");
        Human ivan = new Human("Иван");
        Human vera = new Human("Вера");


        Market market = new Market();

        market.acceptToMarket(List.of(vasya, petya, galina, igor));

        market.giveOrders(vasya, List.of(EProduct.EGGS, EProduct.MILK, EProduct.BREAD));
        market.giveOrders(petya, List.of(EProduct.FISH, EProduct.FISH, EProduct.SUGAR));
        market.giveOrders(galina, List.of(EProduct.COFFIE, EProduct.MILK));
        System.out.println("===============");

        market.update();
        System.out.println("===============");
        market.releaseFromMarket();

        market.acceptToMarket(ivan);
        market.acceptToMarket(petya);

        market.acceptToMarket(vera);
        market.giveOrder(vera, EProduct.BREAD);
        System.out.println("===============");
        market.update();
        System.out.println("===============");
        market.releaseFromMarket();
        System.out.println("===============");
        market.update();

    }
}
