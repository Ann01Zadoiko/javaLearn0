package javaLearn._5;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public void gas(){
        System.out.println("Gas!");
    }

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Sedan extends Car{

    @Override
    public void gas() {
        System.out.println("The sedan gases");
    }

    @Override
    public void brake() {
        System.out.println("The sedan brakes");
    }
}

class Main{
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.gas();
        System.out.print("Across 10 min ");
        sedan.brake();
    }
}