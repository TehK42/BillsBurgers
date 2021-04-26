package com.tehk42;

public class HealthyBurger extends Hamburger {
    public String healthyExtra1Name;
    public double healthyExtra1Price;

    public String healthyExtra2Name;
    public double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price,"Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double burgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            burgerPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null) {
            burgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return burgerPrice;
    }
}

//public class HealthyBurger extends Hamburger {
//    private String healthyExtra1Name;
//    private double healthyExtra1Price;
//    private String healthyExtra2Name;
//    private double healthyExtra2Price;
//
//    public HealthyBurger(String meat, double price) {
//        super("Healthy", meat, price, "Brown rye roll");
//    }
//
//    public void addHealthyAddition1(String name, double price) {
//        this.healthyExtra1Name = name;
//        this.healthyExtra1Price = price;
//    }
//
//    public void addHealthyAddition2(String name, double price) {
//        this.healthyExtra2Name = name;
//        this.healthyExtra2Price = price;
//    }
//
//    @Override
//    public double itemizeHamburger() {
//        double totalPrice = super.itemizeHamburger();
//        if (this.healthyExtra1Name != null) {
//            totalPrice += healthyExtra1Price;
//            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
//        }
//        if (this.healthyExtra2Name != null) {
//            totalPrice += healthyExtra2Price;
//            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
//        }
//        return totalPrice;
//    }
//}
