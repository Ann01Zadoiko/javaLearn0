package javaLearn._3;

public class A2 {
    int i,j;

    void setij(int i, int j){
        this.j =j;
        this.i = i;
    }
}
class B2 extends A2{
    int total;

    void sum(){
        total = i+j;
    }
}

class Main2{
    public static void main(String[] args) {
        B2 b2 = new B2();
        b2.setij(10,12);

        b2.sum();
        System.out.println("Sum equal " + b2.total);
    }
}