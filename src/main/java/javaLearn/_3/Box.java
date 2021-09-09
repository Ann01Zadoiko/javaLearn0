package javaLearn._3;

public class Box {
    double width;
    double height;
    double depth;

    Box (Box box){
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box(double width, double height, double depth){
        this.depth = depth;
        this.height = height;
        this.width =width;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box( double len){
        width = height =depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double weight, double width, double height, double depth){
        this.weight = weight;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
}
class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight boxWeight1 = new BoxWeight(10,20,15,34.3);
        BoxWeight boxWeight2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = boxWeight1.volume();
        System.out.println("Volume boxWeight1 equal " + vol);
        System.out.println("Weight boxWeight1 equal " + boxWeight1.weight);
        System.out.println();

        vol = boxWeight2.volume();
        System.out.println("Volume boxWeight2 equal " + vol);
        System.out.println("Weight boxWeight2 equal " + boxWeight2.weight);
    }
}
class RefDemo{
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3,5,7,8.37);
        Box box = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Volume boxWeight equal " + vol);
        System.out.println("Weight boxWeight equal " + boxWeight.weight);
        System.out.println();

        box = boxWeight;
        vol = box.volume();
        System.out.println("Volume box equal " + vol);


        //Error,because member box doesn't have member weight
        // System.out.println("Weight box equal " + box.weight);
    }
}