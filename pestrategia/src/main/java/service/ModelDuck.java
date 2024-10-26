package service;

public class ModelDuck extends Duck{

    @Override
    public void display(){System.out.println("pato de modelo");}

    public ModelDuck() {
        fb = new FlyNoWay();
        is = new MuteSound();

    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }

}
