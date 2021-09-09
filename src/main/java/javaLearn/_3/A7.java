package javaLearn._3;

abstract class A7 {
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a specific method.");
    }
}
class B7 extends A7{
    void callme(){
        System.out.println("Realisation the method callme in class B7.");
    }
}
class AbstractDemo{
    public static void main(String[] args) {
        B7 b7 = new B7();

        b7.callme();
        b7.callmetoo();
    }
}