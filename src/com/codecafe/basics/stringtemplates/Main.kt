package com.codecafe.basics.stringtemplates

// $ sign is used to access the values of the variables while printing
fun main() {

    val person = Person("John", "Doe", 1001);

    println(person) // Person(firstName=John, lastName=Doe, ssn=1001)

    // WRONG!
    println("First Name : $person.firstName") // First Name : Person(firstName=John, lastName=Doe, ssn=1001).firstName

    // CORRECT!
    println("First Name : ${person.firstName}") // First Name : John

    val amount = 26.27

    println("Amount is $amount") // Amount is 26.27

    println("Amount is $$amount") // Amount is $26.27

    // Any valid Kotlin expression may be used in a String template:
    val numerator = 25.50
    val denominator = 5.20
    println("The value of $numerator divided by $denominator is ${numerator / denominator}") // The value of 25.5 divided by 5.2 is 4.903846153846153

    val n = -5
    val message = "$n is ${if (n > 0) "positive" else "negative"}"
    println(message) // -5 is negative

    // String templates can be nested:
    val msg = "$n is ${
        if (n > 0) "positive" else
            if (n < 0) "negative and ${if (n % 2 == 0) "even" else "odd"}" else "zero"
    }"

    println(msg) // -5 is negative and odd

    println()

    // raw string
    println(
        """raw string:
             |    1
             |   11
             |  111
             | 1111
    """.trimMargin("|")
    )

}