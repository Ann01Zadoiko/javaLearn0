package javaLearn._1;

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] n = {2,8,11};
        int [] n2 = Arrays.copyOf(n,n.length);
        n2[2]=25;
        System.out.println("n = " + Arrays.toString(n) + "\nn2 = " + Arrays.toString(n2));
        int[] n3 = {1,2,3};
        int[] n4 = Arrays.copyOf(n3,5);
        System.out.println("n3 = " + Arrays.toString(n3) + "\nn4 = " + Arrays.toString(n4));
        String [] s= {
                "Za","Xa", "Ca", "Va"
        };
        Arrays.sort(s);
        String [] s2 = Arrays.copyOf(s,3);
        String [] s3 = Arrays.copyOfRange(s,2,s.length);
        System.out.println("s = " + Arrays.toString(s) + "\ns2 = " + Arrays.toString(s2) + "\ns3 = " + Arrays.toString(s3));
    }
}
