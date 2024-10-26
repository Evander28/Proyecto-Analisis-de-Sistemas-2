package service;

public class RubberDuck extends Duck {

    public RubberDuck() {
        is = new Squeak();
        fb = new FlyNoWay();
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }

    @Override
    public void display() {
        System.out.println("Soy un Pato de Goma");
    }
}
