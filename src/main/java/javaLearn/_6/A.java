package javaLearn._6;

public class A {

    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF{

    @Override
    public boolean isNotNegative(int x) {
        return x<0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nestedIF = new B();

        if (nestedIF.isNotNegative(10))
            System.out.println("The number 10 is not negative");
        if (nestedIF.isNotNegative(-12))
            System.out.println("This isn't do");
    }
}