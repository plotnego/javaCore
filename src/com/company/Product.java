package com.company;

public class Product {

    private String name;
    private int price, quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static Product mostExpensive(Product... products){
        Product most = null;
        for(Product p:products){
            if(most == null) most =p;
            else if ( most.getPrice() < p.getPrice() ) most = p;
        }
        return most;
    }

    public static Product biggestQuantity(Product... products){
        Product bigQ = null;
        for(Product p:products){
            if (bigQ == null) bigQ = p;
            else if (bigQ.getQuantity() < p.getQuantity()) bigQ =p;
        }
        return bigQ;
    }

}
