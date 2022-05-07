package com.lesson_3;

public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String toString(){
        return(name+ " \n | " +position+ " | " +email+ " | " +phone+ " | " +salary+ " | " +age);

    }

}
