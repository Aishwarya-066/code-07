/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;



public class inheritance {
    public static void main(String[] args) {
   
        Employee employee1 = new Employee("John Doe", 25, "123-456-7890", "123 Main St", 50000, "Software Developer");

     
        Manager manager1 = new Manager("Jane Smith", 35, "987-654-3210", "456 Oak St", 80000, "IT Department");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Phone Number: " + employee1.phoneNumber);
        System.out.println("Address: " + employee1.address);
        employee1.printSalary();
        System.out.println("Specialization: " + employee1.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager1.name);
        System.out.println("Age: " + manager1.age);
        System.out.println("Phone Number: " + manager1.phoneNumber);
        System.out.println("Address: " + manager1.address);
        manager1.printSalary();
        System.out.println("Department: " + manager1.department);
    }
}

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}
