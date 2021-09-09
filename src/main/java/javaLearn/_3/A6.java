package javaLearn._3;

public class A6 {
    void callme(){
        System.out.println("In method callme() of class A6");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println("In method callme() of class B6");
    }
}
class C6 extends A6{
    void callme(){
        System.out.println("In method callme() of class C6");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A6 a6 = new A6();
        B6 b6 = new B6();
        C6 c6 = new C6();

        A6 r;

        r=a6;
        r.callme();

        r=b6;
        r.callme();

        r=c6;
        r.callme();
    }
}