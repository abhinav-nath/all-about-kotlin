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

11. In Kotlin, the `==` operator compares the contents of two objects

    * In Java, `==` compares two references, and the contents of two objects are compared using the `equals()` method.

    * In Kotlin `==` and `equals()` method do the same thing i.e., compare the contents of two objects.

    * Kotlin compares two references with the `===` operator

      ```
      val employee1 = Employee("John", 35)
      val employee2 = Employee("Tim", 28)
      val employee3 = Employee(John", 35)
      val employee4 = employee1
   
      // Kotlin
      println(employee1 == employee3)       // true
      println(employee1.equals(employee3))  // true
   
      println(employee1 == employee2)       // false
      println(employee1 === employee3)      // false
      println(employee1 === employee4)      // true
   
      // Java
      System.out.println(employee1 == employee3)       // false
      System.out.println(employee1.equals(employee3))  // true
      System.out.println(employee1 == employee4)       // true
      ```

12. Difference in Bitwise operators
   
    * In Java the bitwise operators are like below:
   
      `x | y`
   
      `x & y`

    * But in Kotlin, we spell them out:

      `x or y`

      `x and y`

      `x xor y`


13. Difference in Type Checking and Type Casting

    * In Java, we check the type of any instance using the `instanceof` keyword.
      ```
      if (obj instanceof Employee) {
         // do something
      }
      ```
    * In Kotlin, we check the type of any instance using the `is` keyword.
      ```
      if (obj is Employee) {
         // do something
      }
      ```
      or
      ```
      if (obj !is Employee) {
         // do something
      }
      ```
    * In Java, we cast an instance to another type like this:
      ```
      (Employee) obj;
      ```
    * In Kotlin, type casting is done using the `as` keyword:
      ```
      if (obj is Employee) {
         val newEmployee = obj as Employee
         println(newEmployee.name)
      }
      ```
    * Here is a little magic, _type casting is not really necessary in Kotlin_ !
      As soon as we do a `is` check, Kotlin proactively casts the object automatically for us (under the hood).
      So we don't need to do the type casting manually which is Awesome !

      Hence, we can simply write the code like this:
      ```
      if (obj is Employee) {
         println(newEmployee.name)
      }
      ```
    * Kotlin does a **Smart Casting** for us.


14. String Templates and Raw Strings in Kotlin

     * These are some cool features of Kotlin which are absent in Java.
     * These features are explained here:
        