package javaLearn._5;

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        this.address = address;
        this.name = name;
        this.number = number;
    }

    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck(){
        System.out.println("We are sending a check "  + this.name  + " "  + this.address);
    }

    public String toString(){
        return name +  " " + address  + " " + number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

class Salary extends Employee{
    private double salary;

    public Salary(String name,String address, int number, double salary){
        super(name, address, number);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void mailCheck(){
        System.out.println("Inside mailCheck class Salary");
        System.out.println("Sending check " + getName() + " with salary " + salary);
    }

    public double computePay(){
        System.out.println("Computing salary for " + getName());
        return salary/52;
    }
}

class AbstractDemo1{
    public static void main(String[] args) {
        Salary salary = new Salary("Kate", "New-York",45,3600.00);
        Employee employee = new Salary("John", "Las-Vegas",23,2400.00);
        System.out.println("Calling mailCheck, using a link Salary --");
        salary.mailCheck();
        System.out.println("\n Calling mailCheck, using a link Employee --");
        employee.mailCheck();

    }
}