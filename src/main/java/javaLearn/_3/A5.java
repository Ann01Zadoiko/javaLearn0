package javaLearn._3;

public class A5 {
    int i,j;
    A5(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i+j: " + i + " " + j);
    }
}
class B5 extends A5 {
    int k;
    B5(int a, int b, int c){
        super(a,b);
        k=c;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}
class Override{
    public static void main(String[] args) {
        B5 b5 = new B5(1,2,3);
        b5.show("This is k: ");

        b5.show();
    }
}