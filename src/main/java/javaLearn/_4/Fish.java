package javaLearn._4;

public class Fish implements Swim{
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(" I am a fish and my name is " + name  +  "I am swimming using fins");
    }
}
