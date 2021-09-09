package javaLearn._3;

public class A4 {
    A4(){
        System.out.println("In constructor A4.");
    }
}
class B4 extends A4{
    B4(){
        System.out.println("In constructor B4.");
    }
}
class C4 extends B4{
    C4(){
        System.out.println("In constructor C4.");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C4 c4 = new C4();
    }
}