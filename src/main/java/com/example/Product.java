package com.example;

class Product {
    private String name;
    private double price;
    private double discount;
    private boolean isMarked;

    public Product(String name, double price, double discount, boolean isMarked) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.isMarked = isMarked;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price * (1 - discount / 100);
    }

    public double getOriginalPrice() {
        return price;
    }

    public boolean isMarked() {
        return isMarked;
    }
}
