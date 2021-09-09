package javaLearn._4;

public class Human implements Swim {
    private String name;
    private int age;

    Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(toString() + " I am swimming with a swimming circle");
    }

    @Override
    public String toString(){
        return "I am " + name + ", and I am " + age + " years";
    }
}
