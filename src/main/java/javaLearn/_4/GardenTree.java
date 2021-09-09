package javaLearn._4;

public class GardenTree {
    public void maturation(){
        System.out.println("Parent class: maturation.");
    }
}

class Apple extends GardenTree{
    public void maturation(){
        System.out.println("Maturation apple.");
    }
}

class Cherry extends GardenTree{
    public void maturation(){
        System.out.println("Maturation cherry.");
    }
}

class App {
    public static void ripening_fruit(GardenTree gardenTree){
        gardenTree.maturation();
    }

    public static void main(String[] args) {
        GardenTree apple = new Apple();
        GardenTree cherry = new Cherry();
        ripening_fruit(apple);
        ripening_fruit(cherry);
    }
}