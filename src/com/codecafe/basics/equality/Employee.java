package com.codecafe.basics.equality;

import java.util.Objects;

public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return name.equals(employee.name) && id == employee.id;
        }

        return false;
    }

}