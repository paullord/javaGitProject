package org.example;

public class userClass {
    String name;
    String email;
    String password;
    int age;
    String city;
    String country;
    String phoneNumber;
    String address;
    public userClass() {
    };
    public userClass(String name, String email, String password, int age, String city, String country, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;

}
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
    this.password = password;
    }

public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
public String toString() {
        return "User{name='" + getName() + "', email='" + getEmail() + "', age=" + getAge() + ", city='" + getCity() + "', country='" + getCountry() + "', phoneNumber='" + getPhoneNumber() + "', address='" + getAddress() + "'}";
    }

};

