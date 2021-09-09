package javaLearn.OOP1;

public class Ex01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.toString());
        System.out.println();
        cat = new Cat("Tom",5,2);
        System.out.println(cat.toString());
    }
}
    class Cat{
        private String name;
        private int age;
        private int weight;

        public Cat(){
            name= "Kevin";
            age = 2;
            weight = 1;
        }

        public Cat(String name, int age, int weight){
            this.weight = weight;
            this.age = age;
            this.name = name;
        }
        public String toString(){

            return "name: " + name + "\nage: " + age + "\nweight: " + weight;
        }
    }