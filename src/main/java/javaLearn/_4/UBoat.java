package javaLearn._4;

public class UBoat implements Swim{
    private int speed;

    public UBoat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("The submarine is swimming and the speed is " + speed);
    }
}
