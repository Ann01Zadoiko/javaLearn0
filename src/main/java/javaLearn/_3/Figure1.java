package javaLearn._3;
abstract class Figure1 {
    double dim1;
    double dim2;
    Figure1(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
class Rectangle1 extends Figure1{
    Rectangle1(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("In the area of rectangle.");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1{
    Triangle1(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("In the area of triangle");
        return dim1*dim2/2;
    }
}
class AbstractAreas {
    public static void main(String[] args) {
        Rectangle1 rectangle1 = new Rectangle1(9,5);
        Triangle1 triangle1 = new Triangle1(10,8);
        Figure1 figure1;

        figure1 = rectangle1;
        System.out.println("The area is " + figure1.area());

        figure1 = triangle1;
        System.out.println("The area is " + figure1.area());
    }
}