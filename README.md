# All about Kotlin

Easy to understand examples to get Java developers onboarded to Kotlin.

Kotlin belongs to _JetBrains_ which is the company that created the popular IntelliJ IDE.

Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference.

Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.

Filename extensions: `.kt` `.kts` `.ktm`

The name comes from _Kotlin Island_, near St. Petersburg.

Development lead Andrey Breslav mentioned that the team decided to name it after an island, just like Java was named after the Indonesian island of Java (though the programming language Java was perhaps named after the coffee).

[Hello World in Kotlin](./src/com/codecafe/basics/HelloWorld.kt "Hello World")

## Is Kotlin better than Java?

* Kotlin Application Deployment is faster to compile, lightweight, and prevents applications from increasing size.


* Any chunk of code written in Kotlin is much smaller compared to Java, as it is less verbose and less code means fewer bugs.


* Kotlin compiles the code to a bytecode which can be executed in the JVM.
  Thus, all the libraries and frameworks made in Java transfer and run in a Kotlin project.

* [Differences between Kotlin and Java](./src/com/codecafe/basics/differences-between-kotlin-and-java.md "Differences between Kotlin and Java")
  
## How does Kotlin work?

* When we compile a Kotlin program, the Kotlin compiler - _kotlinc_ compiles the .kt file
 and generates bytecode as .class file.
 

* At this point .class files are equivalent to Java .class files and the JVM can now run them.


* However, when running Kotlin applications, you need the Kotlin runtime library, in addition to the JRE.
So, the Kotlin compiler compiles the .kt files into .class files, which contain bytecode.
The .class files can be run on the JVM exactly like class files generated from Java code.
  

* When distributing a Kotlin application, you have to distribute the Kotlin runtime library and the JRE.
Otherwise the application won't run.
