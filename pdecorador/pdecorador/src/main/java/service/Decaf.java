package service;


public class Decaf extends Beverage {
    public Decaf() {
        description = "Most Excellent Decaf";
    }

    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String toString() {
        return "Decaf{" +
                '\'' + "description" + '\'' + "=" + '\'' + description + '\'' +
                '}';
    }
}