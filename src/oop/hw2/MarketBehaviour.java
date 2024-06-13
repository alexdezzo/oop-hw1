package oop.hw2;
import java.util.List;
public interface MarketBehaviour {

    void acceptToMarket(Human actor); // вошел в магазин
    void releaseFromMarket(Human actors); // вышел из магазина
    void update(); // обновление

}
