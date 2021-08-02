package com.codecafe.basics

fun main() {

    val text: Any = "The quick brown fox jumped over a lazy dog"

    if (text is String) {
        // The variable text is automatically cast to a String in this scope
        // No Explicit Casting needed
        println(text.uppercase())
        println("Length of the string :  ${text.length}")
    }

}