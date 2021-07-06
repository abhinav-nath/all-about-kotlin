package com.codecafe.basics

/*
    Two types of variable declarations:

    1. Using val - like final in Java
    2. Using var - mutable variables

    Kotlin recommends to use val variables to promote immutability.
 */

fun main() {

    // type will be inferred as Int
    // mandatory to provide value in this case
    // then only type inference will work
    // if value is not provided then compilation error
    val number1 = 25

    // or we can specify the type
    val number2: Int = 25

    // initialization is not required in this case
    // as we are mentioning the type here
    val number3: Int

    val shortNumber: Short = 30
    // shortNumber = 50 -> compilation error as it is a final variable

    // var variables are mutable
    // compiler underlines the var variables
    var number = 10
    number = 20

    // type is fixed at declaration time
    // once a variable is declared with a type of data
    // after that the type cannot be changed
    var num = 100
    // num = "hundred" -> compilation error
    // Type mismatch. Required: Int Found: String

}