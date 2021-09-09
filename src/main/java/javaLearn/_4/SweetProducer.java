package javaLearn._4;

import java.util.Arrays;
import java.util.List;

public abstract class SweetProducer {
    public abstract void produceSweet();
}

class CakeProducer extends SweetProducer{

    @Override
    public void produceSweet() {
        System.out.println("Cake produced");
    }
}

class ChocolateProducer extends SweetProducer{

    @Override
    public void produceSweet() {
        System.out.println("Chocolate produced");
    }
}

class CookieProducer extends SweetProducer{

    @Override
    public void produceSweet() {
        System.out.println("Cookie produced");
    }
}

class SweetCreator{
    private List<SweetProducer> sweetProducers;

    public SweetCreator(List<SweetProducer> sweetProducers){
        this.sweetProducers  = sweetProducers;
    }

    public void createSweets(){
        sweetProducers.forEach(sweet -> sweet.produceSweet());
    }
}

class SweetCreatorTest {
    public static void main(String[] args) {
        SweetCreator sweetCreator = new SweetCreator(Arrays.asList(
        new CakeProducer(),
        new ChocolateProducer(),
        new CookieProducer()));

        sweetCreator.createSweets();
    }
}