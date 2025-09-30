package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
userClass user1 = new userClass();
user1.setAge(25);
user1.setCity("ISLAND");
user1.setCountry("NIGERIA");
System.out.println("User age: " + user1.getAge());
System.out.println("User city: " + user1.getCity());
System.out.println("User country: " + user1.getCountry());
    }
}