package com.codecafe.basics.equality.java;

public class Main {
    public static void main(String[] args) {
        EmployeeJ e1 = new EmployeeJ("John", 25);
        EmployeeJ e2 = new EmployeeJ("Tom", 26);
        EmployeeJ e3 = new EmployeeJ("John", 25);
        EmployeeJ e4 = e1;

        // == checks for referential equality
        // equals() checks structural equality (if overridden)

        System.out.println(e1 == e2);       // false
        System.out.println(e1 == e3);       // false
        System.out.println(e1.equals(e3));  // true
        System.out.println(e1 == e4);       // true
    }
}