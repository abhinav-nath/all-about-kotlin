package com.codecafe.basics.datatypes

fun main() {

    // ##### INTEGERS #####

    val myInt = 10

    val myLong1 = 22L      // recommended as it is shorter
    val myLong2: Long = 22

    // auto-widening of numeric types is not supported in Kotlin
    // for instance
    // this is allowed in Java
    // int is automatically widened into long

    // int myInt = 10;
    // long myLong = myInt;

    // but it is not allowed in Kotlin
    var intNum = 10
    var longNum = 20L
    // longNum = intNum  -->  not allowed
    longNum = intNum.toLong() // correct way

    val myByte: Byte = 111
    var myShort: Short
    // myShort = myByte  -->  not allowed
    myShort = myByte.toShort()

    // However, auto-widening is allowed in Numeric literals
    // auto-widening is a problem while assignment of one variable to another
    // it is done by compiler while assigning direct values to variables
    // 5 could be a short or byte but compiler chooses to store it as an Integer
    val anotherInt = 5


    // ##### FLOATING POINT #####

    var myDouble = 27.26
    val myFloat = 27.26f

    myDouble = myFloat.toDouble()


    // ##### CHARACTERS #####

    val char = 'A'       // recommended
    val char1: Char = 'A'

    // in Java
    // char myChar = 65;
    // System.out.println(myChar); --> prints 'A'

    // in Kotlin this is not allowed
    // we cannot treat chars as integers in Kotlin

    // How do we do it in Kotlin ?
    val myCharInt = 65
    println(myCharInt.toChar())  // int to char
    println(char.code)           // char to int


    // ##### BOOLEAN #####
    val myBoolean = true           // recommended
    val myBoolean1: Boolean = true


    // One of the cool things about Kotlin is that we can call Java methods from Kotlin
    // But what if Java method accepts primitive data types ?

    val vacationTime = false
    val onVacation = DummyJavaClass().isVacationTime(vacationTime)
    println("onVacation : $onVacation")

}