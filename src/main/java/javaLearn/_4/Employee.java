package javaLearn._4;

public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void millCheck(){
        System.out.println("We are sending the check for you " + this.name + " " + this.address);
    }

    public String toString(){
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        this.salary = salary;
    }

    public void mailCheck(){
        System.out.println("The class Salary in mailCheck");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double computePay(){
        System.out.println("We are calculating salary for " + getName());
        return salary/52;
    }
}

class VirtualDemo{
    public static void main(String[] args) {
        Salary salary = new Salary("Oleg","Minsck",3,3600.00);
        Employee employee = new Salary("Ivan","Moscow",2,2400.00);
        System.out.println("We are calling mailCheck using the link Salary -- ");
        salary.mailCheck();
        System.out.println("We are calling mailCheck,  using the link Employee");
        employee.millCheck();
    }
}