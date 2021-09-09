package javaLearn._5;

public abstract class Fruit {
    String fruitName;
    String color;

    Fruit(String color){
        this.color = color;
        System.out.println("Fruits constructor");
    }

    abstract void taste();

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
}

class Apple extends Fruit{

    Apple(String color){
        super(color);
        System.out.println("Apple constructor");
    }

    @Override
    void taste() {
        System.out.println("Sweet taste");
    }
}

class Pineapple extends Fruit{

    Pineapple(String color){
        super(color);
        System.out.println("Pineapple constructor");
    }

    @Override
    void taste() {
        System.out.println("Sour taste");
    }
}

 class AbstractDemo {
    public static void main(String[] args) {
        Apple apple = new Apple("red");
        apple.setFruitName("Apple");
        System.out.println("Fruit name: " + apple.fruitName);
        System.out.println("Fruit color: " + apple.color);
        apple.taste();
        System.out.println();
        Pineapple pineapple = new Pineapple("yellow");
        pineapple.setFruitName("Pineapple");
        System.out.println("Fruit name: " + pineapple.fruitName + "\nFruit color: " + pineapple.color);
        pineapple.taste();
    }
}