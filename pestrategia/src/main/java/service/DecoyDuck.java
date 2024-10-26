package service;

public class DecoyDuck extends Duck {

public DecoyDuck() {
    fb = new FlyNoWay();
    is = new MuteSound();
}


    @Override
    public String toString() {
        return "DecoyDuck{}";
    }

    @Override
    public void display() {
        System.out.println("Soy un Pato de Caza");
    }
}


