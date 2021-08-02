package com.codecafe.basics

fun main() {
    var name = "John"
    var age = 40
    var salary = 80456.55

    val employeeDetails: List<Any> = listOf(name, age, salary)

    // type checking using if-else
    for (attribute in employeeDetails) {
        if (attribute is String) {
            println("Name : $attribute")
        } else if (attribute is Int) {
            println("Age : $attribute")
        } else if (attribute is Double) {
            println("Salary : $attribute")
        } else {
            println("Not a valid attribute")
        }
    }

    println()

    // type checking using when - recommended
    for (attribute in employeeDetails) {
        when (attribute) {
            is String -> println("Name : $attribute")
            is Int -> println("Age : $attribute")
            is Double -> println("Salary : $attribute")
            else -> println("Not a valid attribute")
        }
    }

}