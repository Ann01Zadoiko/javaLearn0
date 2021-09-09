package javaLearn._4;

import java.util.Arrays;
import java.util.List;

public class MainSwim {
    public static void main(String[] args) {
        Swim human = new Human("Anthony",6);
        Swim fish = new Fish("Whale");
        Swim boat = new UBoat(25);

        List<Swim> swimmers = Arrays.asList(human,fish,boat);
        for (Swim swim: swimmers){
            swim.swim();
        }
    }
}
