package javaLearn._3;

public class A1 {
    int i,j;

    void showij(){
        System.out.println("i + j: " + i + " " + j);
    }
}
class B1 extends A1 {
    int k;
    void showK(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i+j+k= " + (i+j+k));
    }
}
class Main1{
    public static void main(String[] args) {
        A1 superOb = new A1();
        B1 subOb = new B1();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.k= 9;
        subOb.j = 8;
        subOb.i = 7;
        System.out.println("Содержимое объетка subOb: ");
        subOb.showij();
        subOb.showK();
        System.out.println();

        System.out.println("Сумма i,j,k в объекте subOb:");
        subOb.sum();
    }
}