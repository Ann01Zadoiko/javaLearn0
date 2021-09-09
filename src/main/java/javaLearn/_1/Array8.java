package javaLearn._1;


import java.util.Arrays;
import java.util.Random;

public class Array8 {
    static void shuffleArray(int[] ar){
        Random random = new Random();
        for (int i=ar.length-1;i>0;i--){
            int index = random.nextInt(i+1);
            int a=  ar[index];
            ar[index] = ar[i];
            ar[i] = a;
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        int [] m = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        shuffleArray(m);
        Arrays.toString(m);
    }
}
