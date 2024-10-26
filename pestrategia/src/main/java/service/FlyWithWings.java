package service;

public class FlyWithWings implements FlyBehavior {

    public FlyWithWings() {
    }

    @Override
    public void fly() {
        System.out.println("Estoy Volando");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}
