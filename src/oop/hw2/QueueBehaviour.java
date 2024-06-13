package oop.hw2;
import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Human actor);
    void takeOrders(); // сделать заказы
    void giveOrders(Human actor, List<EProduct> products); // забрать заказы
    void releaseFromQueue(Human actor); // выйти из очереди




}
