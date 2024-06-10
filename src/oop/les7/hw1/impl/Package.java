package oop.les7.hw1.impl;

public enum Package {
    PLASTICK("пластик"), GLASS("стекло");

    private final String material;
    Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
