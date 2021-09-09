package javaLearn._3;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("The area figure doesn't sent");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("In the area of rectangle");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("In the area of triangle");
        return dim1*dim2/2;
    }
}
class FindArea {
    public static void main(String[] args) {
        Figure figure = new Figure(10,10);
        Rectangle rectangle = new Rectangle(9,5);
        Triangle triangle = new Triangle(10,8);
        Figure f;
        f= rectangle;
        System.out.println("The area of rectangle is " + f.area());

        f = triangle;
        System.out.println("The area of triangle is " + f.area());

        f = figure;
        System.out.println("The area of figure is " + f.area());
    }
}