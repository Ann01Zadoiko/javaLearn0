package javaLearn._1;

import java.util.Arrays;

public class Array11 {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1,9);
        Arrays.fill(a2,9);
        System.out.println("a1==a2 is " + Arrays.equals(a1,a2));
        a2[3] = 11;
        System.out.println("a1==a2 is " + Arrays.equals(a1,a2));
    }
}
