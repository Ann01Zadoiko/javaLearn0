package javaLearn.Array;

public class Array2 {
    //Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
    public static void main(String[] args) {
        int [] n = new int [15];
        for (int i=0; i<n.length;i++){
            if (i==0){n[i]=2;}
            n[i]=i*2+2;
        }
        for(int i:n){
            System.out.print(i + "  ");
        }
    }
}
