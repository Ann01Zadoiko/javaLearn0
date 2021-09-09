package javaLearn.Array;

public class Array07 {
    //Дан массив с числами 5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4. Переместить все нули в конец массива.

    static void swap (int []a, int i, int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    static void toString(int [] n){
        for (int i: n){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] n = {5,4,3,0,6,0,0,5,6,0,25,0,8,7,3,0,1,1,0,6,4};
        int m= n.length;
        for (int i=0,j=0;j<m;j++){
            if (n[j]!=0){
                if (i<j){
                    swap(n,i,j);
                }
                i++;
            }
        }
        toString(n);
    }
}
