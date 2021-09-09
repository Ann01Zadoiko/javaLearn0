package javaLearn._5;

public abstract class Figure {

    float x,y;

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }

    public abstract float getPerimeter();

    public abstract float getArea();
}

class Rectangle extends Figure{
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){
        super(x, y);
        this.height = height;
        this.width = width;
    }


    @Override
    public float getPerimeter() {
        return width*2 + height*2;
    }

    @Override
    public float getArea() {
        return width * height;
    }
}

class FigureDemo{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,23,45,56);
        System.out.println("The perimeter: " + rectangle.getPerimeter());
        System.out.println("The area: " + rectangle.getArea());
    }
}