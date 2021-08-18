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
   ```kotlin
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
   ```kotlin
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
    ```kotlin
    val employee = Employee()
    ```


11. In Kotlin, the `==` operator compares the contents of two objects

    * In Java, `==` compares two references, and the contents of two objects are compared using the `equals()` method.

    * In Kotlin `==` and `equals()` method do the same thing i.e., compare the contents of two objects.

    * Kotlin compares two references with the `===` operator

      ```kotlin
      val employee1 = Employee("John", 35)
      val employee2 = Employee("Tim", 28)
      val employee3 = Employee("John", 35)
      val employee4 = employee1
   
      // Kotlin
      println(employee1 == employee3)       // true
      println(employee1.equals(employee3))  // true
   
      println(employee1 == employee2)       // false
      println(employee1 === employee3)      // false
      println(employee1 === employee4)      // true
      ```
   
      ```java
      // Java
      System.out.println(employee1 == employee3)       // false
      System.out.println(employee1.equals(employee3))  // true
      System.out.println(employee1 == employee4)       // true
      ```

12. Difference in Bitwise operators
   
    * In Java the bitwise operators are like below:
   
      ```java
      x | y
      ```
   
      ```java
      x & y
      ```

    * But in Kotlin, we spell them out:

      ```kotlin
      x or y
      ```

      ```kotlin
      x and y
      ```

      ```kotlin
      x xor y
      ```


13. Difference in Type Checking and Type Casting

    * In Java, we check the type of any instance using the `instanceof` keyword.
      ```java
      if (obj instanceof Employee) {
         // do something
      }
      ```
    * In Kotlin, we check the type of any instance using the `is` keyword.
      ```kotlin
      if (obj is Employee) {
         // do something
      }
      ```
      or
      ```kotlin
      if (obj !is Employee) {
         // do something
      }
      ```
    * In Java, we cast an instance to another type like this:
      ```java
      (Employee) obj;
      ```
    * In Kotlin, type casting is done using the `as` keyword:
      ```kotlin
      if (obj is Employee) {
         val newEmployee = obj as Employee
         println(newEmployee.name)
      }
      ```
    * Here is a little magic, _type casting is not really necessary in Kotlin_ !
      As soon as we do a `is` check, Kotlin proactively casts the object automatically for us (under the hood).
      So we don't need to do the type casting manually which is Awesome !

      Hence, we can simply write the code like this:
      ```kotlin
      if (obj is Employee) {
         println(newEmployee.name)
      }
      ```
    * Kotlin does a **Smart Casting** for us.


14. String Templates and Raw Strings in Kotlin

     * These are some cool features of Kotlin which are absent in Java.
     * [String Templates](./stringtemplates/string-templates.md "String Templates in Kotlin") | [Code](./stringtemplates "Code Examples")


15. Kotlin has another cool feature `REPL (Read Eval Print Loop)`. It lets us run Kotlin snippets in CLI.
    It is similar to `jshell` of Java but REPL knows about the definitions in our project as well, so we can use the components of our project.
    We cannot do that in jshell.
    - Activate REPL in IntelliJ:
    - `Tools -> Kotlin -> Kotlin REPL`


16. All the Kotlin data types are same as Java's except for few differences:
    - There are no primitive (lowercase) data types in Kotlin like those in Java.
    - _Auto-widening_ of numeric data types is not supported in Kotlin.
    - We cannot treat chars as integers in Kotlin.
    - [Code example](./datatypes/Datatypes.kt "Datatypes in Kotlin")


17. In Java, the `Object` class is the base class of all classes.
    In Kotlin, the `Any` class is the root of the Kotlin class hierarchy.
    Every Kotlin class has `Any` as a superclass.

    Like Java's `Object` class, the `Any` class of Kotlin contains these three elemental methods:
    1. equals()
    2. hashCode()
    3. toString()


18. The `Nothing` class of Kotlin has no equivalent present in Java.

    Fun fact is that `Nothing` class is the sub-class of every class in Kotlin.
