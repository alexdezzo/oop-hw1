package oop.hw2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Human> actors = new ArrayList<>();

    private List<Human> actorsAtMarket = new ArrayList<>();


    @Override
    public void acceptToMarket(Human actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
            System.out.printf("%s вошел в магазин.\n", actor.getName());
        } else {
            System.out.printf("%s уже в магазине!\n", actor.getName());
        }
    }


    public void acceptToMarket(List<Human> group) {
        for (Human actor : group) {
            actors.add(actor);
        }
        System.out.println("Группа покупателей вошла в магазин.");
    }


    @Override
    public void releaseFromMarket(Human actor) {
        int numActor = actors.indexOf(actor);
        actors.remove(numActor);
        System.out.printf("%s вышел из магазина.\n", actor.getName());
    }

    public void releaseFromMarket() {
        List<Human> temp = new ArrayList<>();
        for (Human human : actors) {
            if (human.isMakeOrder()) {
                System.out.printf("%s вышел из магазина, получив заказ.\n", human.getName());
                temp.add(human);
            } else if (!human.isMakeOrder()) {
                System.out.printf("%s вышел из магазина, не сделав заказ.\n", human.getName());
                temp.add(human);
            }
        }
        actors.removeAll(temp);
    }


    @Override
    public void update() {
        int i = 0;
        for (Human human : actors) {
            if (human.isMakeOrder() & !human.isTakeOrder()) {
                takeInQueue(human);
            }
        }
        while (actorsAtMarket.size() > 0) {
            while (actorsAtMarket.size() > 0) {
                takeOrders();
                i++;
            }
        }
        System.out.printf("STATUS: %d заказов выдано, в магазине осталось %d посетителей. \n", i, actors.size());
    }


    @Override
    public void takeOrders() {
        Human actorWithOrder = actorsAtMarket.remove(0);
        System.out.printf("%s получил заказ и вышел из очереди.\n", actorWithOrder.getName());
        actorWithOrder.setTakeOrder(true);
    }

    @Override
    public void giveOrders(Human actor, List<EProduct> products) {
        if (actor.isTakeOrder()) {
            System.out.printf("%s Дополнил заказ.\n", actor.getName());
        } else {
            System.out.printf("%s сделал закзаз.\n", actor.getName());
        }
        int nameActor = actors.indexOf(actor);
        Human tempActor = actors.remove(nameActor);
        tempActor.saveOrder(products);
        actors.add(tempActor);
    }

    public void giveOrder(Human actor, EProduct product) { // сделать заказ/добавить продукт
        if (actor.isMakeOrder()) {
            System.out.printf("%s дополнил заказ.\n", actor.getName());
        } else {
            System.out.printf("%s сделал заказ.\n", actor.getName());
        }
        int namActor = actors.indexOf(actor);
        Human tempActor = actors.remove(namActor);
        tempActor.saveOrder(product);
        actors.add(tempActor);
    }

    @Override
    public void releaseFromQueue(Human actor) {
        System.out.printf("%s вышел из очереди не получив заказ.\n", actor.getName());
        int namActor = actors.indexOf(actor);
        actorsAtMarket.remove(namActor);
    }


    @Override
    public void takeInQueue(Human actor) {// вход в очередь
        System.out.printf("%s встал в очередь за заказом.\n", actor.getName());
        if (actor.isMakeOrder()) {
            actorsAtMarket.add(actor);
        }

    }


    public void releaseFromQueue() {
        System.out.printf("%s вышел из очереди не получив заказ.\n", actors.get(0).getName());
        actorsAtMarket.remove(0);
    }


    public int countActors() {
        return actors.size();
    }
}
