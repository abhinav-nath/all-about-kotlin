package com.codecafe.basics.equality;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 25);
        Employee e2 = new Employee("Tom", 26);
        Employee e3 = new Employee("John", 25);
        Employee e4 = e1;

        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        System.out.println(e1.equals(e3));
        System.out.println(e1 == e4);
    }
}