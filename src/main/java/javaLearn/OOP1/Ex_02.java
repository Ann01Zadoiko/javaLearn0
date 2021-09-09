package javaLearn.OOP1;

public class Ex_02 {
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2("Max",6,10);
        System.out.println(cat2.toString());
        System.out.println();
        cat2.setAge(5);
        cat2.setName("Miranda");
        cat2.setWeight(4);
        System.out.println("name: " + cat2.getName() + " age: " + cat2.getAge() + " weight: " + cat2.getWeight());

    }
}
    class Cat2 {
    private String name;
    private int age;
    private int weight;

    public String toString(){
        return "name: " + name + " age: " + age + " weight: " + weight;
    }

    public Cat2(String name, int age, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int i){
        this.weight = weight;
    }
    }