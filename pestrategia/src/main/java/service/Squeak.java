package service;

public class Squeak implements ISound{


    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }

    @Override
    public String toString() {
        return "Squeak{}";
    }
}
