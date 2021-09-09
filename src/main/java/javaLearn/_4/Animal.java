package javaLearn._4;

public class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Horse extends Animal{
    @Override
    public void sound(){
        System.out.println("Neigh");
    }

    public static void main(String[] args) {
        Animal animal = new Horse();
        animal.sound();
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
    }
}

