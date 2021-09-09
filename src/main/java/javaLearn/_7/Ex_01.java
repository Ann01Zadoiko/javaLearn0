package javaLearn._7;

public class Ex_01 {
    public static void main(String[] args) {
        int d,a;

        try{
            d=0;
            a=42/d;
            System.out.println("This won't do");
        } catch (ArithmeticException e){
            System.out.println("Деление на нуль");
        }
        System.out.println("После оператора catch");
    }
}
