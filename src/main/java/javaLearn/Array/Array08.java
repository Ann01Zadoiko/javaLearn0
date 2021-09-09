package javaLearn.Array;

import java.util.Arrays;

public class Array08 {
    static void fill(int [][]a,int m,int n ){
        int v=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = v;
                v++;
            }

        }
    }
    public static void main(String[] args) {
        int a=3, b=4;
        int [][] n = new int[a][b];
        fill(n,a,b);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
       // Arrays.stream(n).map(Arrays::toString).forEach(System.out::println);
    }
}
