package javaLearn.OOP1;

public class Ex_04 {
    public static void main(String[] args) {
        Cat0 cat0 = new Cat0("Vacka",5);
        Dog dog = new Dog("Sharik",4);

        System.out.println(cat0.isDogNear(dog));
        System.out.println(dog.isCatNear(cat0));
    }
}
    class Cat0{
        private String name;
        private int speed;

        public Cat0(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isDogNear(Dog dog){
            return this.speed > dog.getSpeed();
        }
    }

    class Dog{
        private String name;
        private int speed;

        public Dog(String name, int speed){
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isCatNear(Cat0 cat0){
            return this.speed > cat0.getSpeed();
        }
    }