package javaLearn.Array;



public class Array06 {
    // Имеется массив, нужно переставить элементы массива в обратном порядке.
    public static void main(String[] args) {
        int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        reverse(mice);
    }
    static void reverse(int [] n){
        for (int i=0; i<n.length/2;i++){
            int t = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i]=t;
        }
        for (int i:n){
            System.out.print(i + " ");
        }
    }

}
