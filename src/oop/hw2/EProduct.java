package oop.hw2;

public enum EProduct {

    MILK("Молоко"),
    BREAD("Хлеб"),
    EGGS("Яйца"),
    MEAT("Мясо"),
    SUGAR("Сахар"),
    COFFIE("Кофе"),
    FISH("Рыба");

    private String title;

    EProduct(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
