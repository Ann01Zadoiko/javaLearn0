package javaLearn._1;

import java.util.Random;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        double [] a= new double[n];
        double[] b= new double[n];
        Random random= new Random();
        for (int i=0;i<a.length;i++){
            a[i]= random.nextDouble();
            System.out.println(a[i]);
        }
        System.out.println();
        for (int i=0;i<b.length;i++){
            b[i]= random.nextDouble();
            System.out.println(b[i]);
        }
        for(int i=0;i<b.length;i++){
        if (a[i]==0) System.out.println(b[i]);}
        for(int i=0;i<a.length;i++){
        if (b[i]==0) System.out.println(a[i]);}
        double[] r = new double[a.length + b.length];
        System.arraycopy(a,0,r,0,a.length);
        System.arraycopy(b,0,r,0,b.length);
        for(int i=0; i<r.length;i++){
        System.out.println(r);}
    }
}
