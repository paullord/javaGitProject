package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
userClass user1 = new userClass();
user1.setAge(25);
user1.setCity("ISLAND");
user1.setCountry("NIGERIA");
user1.setAddress("123 Main St");
user1.setEmail("abapaullord@gmail.com");
user1.setName("PAUL");
user1.setPassword("password123");
user1.setPhoneNumber("123-456-7890");
System.out.println("User age: " + user1.getAge());
System.out.println("User city: " + user1.getCity());
System.out.println("User country: " + user1.getCountry());
System.out.println("User address: " + user1.getAddress());
System.out.println("User email: " + user1.getEmail());
System.out.println("User name: " + user1.getName());
System.out.println("User password: " + user1.getPassword());
System.out.println("User phone number: " + user1.getPhoneNumber());
        SalaryClass salary1 = new SalaryClass();
        salary1.setSalary(50000);
        System.out.println("Salary: " + salary1.getSalary());
        
    }


}