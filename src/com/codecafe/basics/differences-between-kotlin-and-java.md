## Differences between Kotlin and Java


1. No semicolons in Kotlin
    * A Semicolon is not required in Kotlin but even if you use it, it is not an error.


2. Kotlin STL has many wrappers for some of the most used Java methods
    * For example, we just use `println("Hello")`
    * Under the covers, **STL** uses `System.out.println("Hello")` only.


3. In Java, the keywords cannot be used as variable names

    * Kotlin has a concept of **hard keywords** and **soft keywords**.

    * Hard keywords cannot be used as variable names but soft keywords can be used as variable names.

    * It is highly recommended to not use soft keywords as variable names as it leads to a
   very confusing code.


4. In Kotlin, square brackets can be used to access any index of a Collection:
    ```
    val names = arrayListOf("Apple", "Banana", "Mango")  
    println(names[1])
   ```

5.  Kotlin has its own `String` class
    * It has string's `length` as a property.
    * In Java `length()` is a method of String class.
 

6. Kotlin does not distinguish between Checked and Unchecked exceptions
    * In Java, if a method throws an `IOException` (checked exception) and does not catch it
      then we need to declare that this method `throws` an `IOException`.

    * We don't need to do that in Kotlin. All exceptions are unchecked in Kotlin.

    * In fact the `throws` keyword does not even exist in Kotlin.


7. The Ternary operator ( `?:` ) does not exist in Kotlin


8. Original for loop does not exist in Kotlin
    ```
    for(i = 0; i < 10; i++) {
        // do something 
    }
   ```


9. Kotlin does not have a `static` keyword (_syntactically_)

    * One way how `static` like functionality is achieved in Kotlin
      is by using top-level functions (not enclosed inside any class).

    * Under the hood, these functions are `static` only because Kotlin
      is ultimately a JVM based language.

    * Kotlin just doesn't use `static` in the syntax, the concept is still there.


10. There is no `new` keyword in Kotlin

    ```
    val employee = Employee()
    ```