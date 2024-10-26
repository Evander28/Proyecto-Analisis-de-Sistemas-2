package service;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        fb = new FlyWithWings();
        is = new Quack();
    }

    @Override
    public String toString() {
        return "RedHeadDuck{}";
    }


    @Override
    public void display() {
        System.out.println("Soy un Pato Cabeza Roja");
    }
}
