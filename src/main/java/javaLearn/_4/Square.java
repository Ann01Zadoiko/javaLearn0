package javaLearn._4;

public class Square {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return this.width*this.width;
    }
}

class Rectangle extends Square{
    int height;

    public Rectangle(int width, int height){
        super(width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea(){
        return this.getHeight() * this.getWidth();
    }
}

class AreaCalculator{
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(4,5);

        int squareArea = square.calculateArea();
        int rectangleArea = rectangle.calculateArea();

        System.out.println("Square area: " + squareArea + " sq.cm");
        System.out.println("Rectangle area: " + rectangleArea + " sq.cm");
    }
}