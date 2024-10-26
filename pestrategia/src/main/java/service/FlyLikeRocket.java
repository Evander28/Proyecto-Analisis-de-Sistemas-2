package service;

public class FlyLikeRocket implements FlyBehavior{
    public FlyLikeRocket() {}

    @Override
    public void fly() {
        System.out.println("volar como cohete");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
