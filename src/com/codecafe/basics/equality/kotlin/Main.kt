package com.codecafe.basics.equality.kotlin

fun main() {

    val e1 = EmployeeK("John", 25)
    val e2 = EmployeeK("Tom", 26)
    val e3 = EmployeeK("John", 25)
    val e4 = e1

    // === checks for referential equality
    // == and equals() checks for structural equality

    println(e1 === e2)       // false
    println(e1 === e3)       // false
    println(e1.equals(e2))   // false
    println(e1.equals(e3))   // true
    println(e1 == e3)        // true
    println(e1 === e4)       // true

}