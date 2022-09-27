import java.util.Scanner;
class Employee01{
    String name;
    float salary;
    int empId;
    Employee01(){
        System.out.println("I m default constructor");
    }
    Employee01(String name, int empId, float salary){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
    public String showName(){
        return "Name: "+ this.name;
    }
    public float showSalary(){
        System.out.println();
        return this.salary;
    }
    public float increaseSalary(){
        Scanner sc = new Scanner(System.in);
        float rate = sc.nextFloat();
        System.out.print("Increment in salary is ");
        return this.salary*rate;
    }
}
class Manager extends Employee01{
    String name;
    float salary;
    int empId;
    String dept = "manager";
    Manager(String name, int empId, float salary, String dept){
        super(name,empId,salary);
        this.dept = dept;
    }
    public void showDetails(){
        System.out.println("Name: " + super.name + " Salary: " + super.salary + " Department: " + dept);
    }
}

public class Exp4que5 {
    public static void main(String[] args) {

        Manager m1 = new Manager("John", 234, 345677.8f,"Management");
        m1.showDetails();
        Employee01 e1 = new Employee01("Sahil", 567, 67989.0f);
        e1.increaseSalary();
    }
}
