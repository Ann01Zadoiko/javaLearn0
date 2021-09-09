package javaLearn._4;

public class Overload {
    void demo(int a){
        System.out.println("a " + a);
    }
    void demo(int a, int b){
        System.out.println("a and b " + a + " , " + b);
    }
    double demo(double a){
        System.out.println("double a " + a);
        return a*a;
    }
}

class MethodOverloading{
    public static void main(String[] args) {
        Overload override = new Overload();
        double result;
        override.demo(10);
        override.demo(10,20);
        result = override.demo(5.5);
        System.out.println("O/P : " + result);
    }
}