package service;

public class MallardDuck extends Duck {

    public MallardDuck() {
        fb = new FlyWithWings();
        is = new Quack();
    }


    @Override
    public String toString() {
        return "MallardDuck{}";
    }

    @Override
    public void display() {
        System.out.println("Soy un Pato Silvestre");
    }
}
