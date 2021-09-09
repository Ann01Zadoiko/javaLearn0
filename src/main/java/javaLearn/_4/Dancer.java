package javaLearn._4;

import java.util.Arrays;
import java.util.List;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void dance(){
        System.out.println(toString() + "I dance as everybody");
    }

    @Override
    public String toString(){
        return "I " + name + ", am " + age + " years. ";
    }
}

class ElectricBoogieDancer extends Dancer{
    public ElectricBoogieDancer(String name, int age){
        super(name, age);
    }

    @Override
    public void dance(){
        System.out.println(toString() + "I am dancing the electric boogie");
    }
}

class BreakDankDancer extends Dancer{
    BreakDankDancer(String name, int age){
        super(name, age);
    }

    @Override
    public void dance(){
        System.out.println(toString() + "I am dancing break dance");
    }
}

class Main{
    public static void main(String[] args) {
        Dancer dancer = new BreakDankDancer("Anthony",18);

        Dancer breakDankDancer = new BreakDankDancer("Alex",19);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Valera", 20);

        List<Dancer> discotheque = Arrays.asList(dancer,breakDankDancer,electricBoogieDancer);
        for (Dancer dancer1: discotheque){
            dancer1.dance();
        }
    }
}