package com.codecafe.basics.equality.java;

public class EmployeeJ {

    private String name;
    private int id;

    public EmployeeJ(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj == this)
            return true;

        if (obj instanceof EmployeeJ) {
            EmployeeJ employee = (EmployeeJ) obj;
            return name.equals(employee.name) && id == employee.id;
        }

        return false;
    }

}