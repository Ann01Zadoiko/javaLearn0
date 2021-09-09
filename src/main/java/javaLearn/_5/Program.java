package javaLearn._5;

public class Program {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Sam", "Leman Brothers");
        Client client = new Client("Bob","Leman Brothers");
        employee1.display();
        client.display();
    }
}

abstract class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

class Employee1 extends Person{
    private String bank;

    public Employee1(String name, String company){
        super(name);
        bank = company;
    }

    @Override
    public void display() {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(),bank);
    }
}

class Client extends Person{
    private String bank;

    public Client(String name, String company){
        super(name);
        bank = company;
    }

    @Override
    public void display() {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}