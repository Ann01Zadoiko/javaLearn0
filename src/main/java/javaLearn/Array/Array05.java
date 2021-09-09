package javaLearn.Array;

public class Array05 {
    //Написать метод getMax(), который вычисляет максимальное значение из массива.
    // Ну и метод getMin() для нахождения минимального значения.
    //Похожая задача - найти три наибольших числа из массива mice (предыдущая задача)
    public static void main(String[] args) {
        int[] mice = new int[] { 4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19 };
        getMax(mice);
        getMin(mice);
        getThreeMax(mice);

    }
    static void getThreeMax(int []n){
        int max1,max2,max3;
        max1=max2=max3=n[0];
        for (int i=0; i<12;i++){
            if (n[i]>max1){
                max1 = n[i];
            }
            if (n[i]>max2&&n[i]<max1){
                max2= n[i];
            }
            if (n[i]>max3&&n[i]<max2){
                max3 = n[i];
            }
        }
        System.out.println("Max1: " + max1 + "  Max2: " + max2 + "  Max3: " + max3);
    }
    static void getMax(int[] n){
        int max = n[0];
        for (int i=0; i<12;i++){
            if (n[i]>max) max = n[i];
        }
        System.out.println("Max: " + max);
    }
    static void getMin(int[] n){
        int min = n[0];
        for (int i=0; i<12;i++){
            if (n[i]<min) min = n[i];
        }
        System.out.println("Min: " + min);
    }
}
