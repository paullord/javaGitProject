package org.example;

public class SalaryClass {

    SalaryClass(){

    }
    SalaryClass(int salary){
        this.salary = salary;
    }
    int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
