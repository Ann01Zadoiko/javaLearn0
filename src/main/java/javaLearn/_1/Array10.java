package javaLearn._1;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int size = 4;
        boolean [] t = new boolean[size];
        int [] t2 = new int[size];
        String [] t3 = new String[size];
        Arrays.fill(t,true);
        Arrays.fill(t2,9);
        Arrays.fill(t3,"Moew");
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(t2));
        System.out.println(Arrays.toString(t3));
    }
}
