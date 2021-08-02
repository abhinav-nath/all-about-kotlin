package com.codecafe.basics.datatypes

import java.math.BigDecimal

// Arrays are Collections in Kotlin

fun main() {

    val names = arrayOf("John", "Joe", "Jane", "Jennifer")

    val longs1 = arrayOf(1L, 2L, 3L, 4L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    println("longs1 is Array<Long> : ${longs1 is Array<Long>}")
    println("longs2 is Array<Long> : ${longs2 is Array<Long>}")
    // println("longs3 is Array<Long> : ${longs3 is Array<Long>}")  -->  Compilation Error, longs3 is an Integer array by default

    // initialize an array of first 16 even numbers
    val evenNumbers = Array(16) { i -> i * 2 }

    for (number in evenNumbers) {
        print("$number ")
    }

    // initialize an array with all zeroes
    val allZeroes = Array(100) { 0 }


    // we can create an array of mixed types
    val mixedArray = arrayOf("hello", 27, BigDecimal(27.26), 'Z')

    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<*>)  // true


    val myIntArray = arrayOf(1, 2, 3, 4, 5, 6)

    // DummyJavaClass().printNumbers(myIntArray)   Type mismatch --> Compilation Error
    DummyJavaClass().printNumbers(myIntArray.toIntArray())

    println()

    // or

    val myIntArray1 = intArrayOf(1, 2, 3, 4, 5, 6)
    DummyJavaClass().printNumbers(myIntArray1)


    // Arrays of primitive types are initialized automatically
    // Array of non-primitive types are not initialized automatically

    var primitiveIntArray = IntArray(5)

    for (num in primitiveIntArray)
        print("$num ")

}