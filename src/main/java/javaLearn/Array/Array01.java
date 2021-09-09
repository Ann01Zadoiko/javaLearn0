package javaLearn.Array;

public class Array01 {
    //Имеется массив из четырёх чисел int[] numbers = {3, 9, 11, 15};. Поменяйте местами первый и второй элемент массива.
    public static void main(String[] args) {
        int num[] = {3,9,11,15};
       // num[0]=num[1];
       // num[1]=3;
            int t= num[0];
            num[0] = num[1];
            num[1]=t;
        for(int n: num){
            System.out.print(n + "  ");
        }
    }
}
