package javaLearn.Array;

public class Array04 {
    //Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
    // Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
    static int f(int n){
        if (n<=1) {return 1;}
        return f(n-2)+f(n-1);
    }

    public static void main(String[] args) {
        int [] n = new int[20];
        for (int i=0; i<n.length;i++){
            n[i]=f(i);
        }
        for (int i: n){
            System.out.print(i + " ");
        }
    }

}
