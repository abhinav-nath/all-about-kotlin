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