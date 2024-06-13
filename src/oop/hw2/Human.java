package oop.hw2;
import java.util.ArrayList;
import java.util.List;


public class Human extends Actor {

    public List<EProduct> order = new ArrayList<>();

    public Human(String name) {
        super(name);
        order = new ArrayList<>();
        setMakeOrder(false);
        setTakeOrder(false);

    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setMakeOrder(boolean flag) {
        this.isMakeOrder = flag;
    }
    @Override
    public void setTakeOrder(boolean flag) {
        this.isTakeOrder = flag;
    }
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void saveOrder(EProduct product){
        order.add(product);
        setMakeOrder(true);
    }


    public void saveOrder(List<EProduct> products){
        order.addAll(products);
        setMakeOrder(true);
    }


    @Override
    public String toString() {
        return name;
    }
}
