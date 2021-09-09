package javaLearn.OOP1;

public class Ex_03 {
    public static void main(String[] args) {
        Cat3 cat3 = new Cat3("Miranda",6,4);
        cat3.setSpeed(28);
        System.out.println(cat3.toString());

    }
}
    class Cat3{
    private String name;
    private int age;
    private int weight;
    private int speed;

    public Cat3(String name, int age, int weight){
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "Cat3{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", speed=" + speed +
                    '}';
        }
    }