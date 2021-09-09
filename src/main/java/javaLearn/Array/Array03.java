package javaLearn.Array;

public class Array03 {
    //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
    // а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

    public static void main(String[] args) {
        int n[] = new int [50];
        for (int i=0;i<n.length;i++){
            if (i==0){
                n[i]=1;
            }
            n[i]=i*2+1;
        }
        int [] n1 = new int[50];
        for (int i=0, j=99;i<n1.length;i++,j-=2){
            n1[i]=j;
        }
        for(int i:n){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i:n1){
            System.out.print(i + " ");
        }

    }
}
