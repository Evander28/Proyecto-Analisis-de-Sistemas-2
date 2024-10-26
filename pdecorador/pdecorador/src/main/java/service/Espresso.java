package service;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Most Excellent Espresso";
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