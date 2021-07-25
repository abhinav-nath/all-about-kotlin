package com.codecafe.basics.stringtemplates

class Person(var firstName: String, var lastName: String, val ssn: Int) {

    // $ sign is used to access the values of the variables while printing
    override fun toString(): String {
        return "Person(firstName=$firstName, lastName=$lastName, ssn=$ssn)"
    }

}