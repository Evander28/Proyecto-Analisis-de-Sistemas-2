package service;

public class MuteSound implements ISound{


    @Override
    public String toString() {
        return "MuteSound{}";
    }

    @Override
    public void makeSound() {
        System.out.println("Sin sonido");
    }
}
