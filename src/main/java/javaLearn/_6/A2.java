package javaLearn._6;

public interface A2 {
    void meth1();
    void meth2();
}

interface B2 extends A2{
    void meth3();
}

class MyLass implements B2{

    @Override
    public void meth1() {
        System.out.println("Reaction the method meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Reaction the method meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Reaction the method meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyLass myLass = new MyLass();

        myLass.meth1();
        myLass.meth2();
        myLass.meth3();
    }
}