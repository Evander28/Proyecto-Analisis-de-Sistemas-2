package service;

public abstract class Duck {

    protected FlyBehavior fb;
    protected ISound is;


    public Duck(){}

    public void swim(){
        System.out.println("Estoy nadando");
    }


    public void performFly() {
        fb.fly();
    }

    public void perfomSound(){
        is.makeSound();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.fb = fb;
    }

    public void setISound(ISound is) {
        this.is = is;
    }


    public abstract void display();

    @Override
    public String toString() {
        return "Duck{}";
    }


}
