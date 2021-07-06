# Type Aliases (since Kotlin 1.1)

Kotlin focuses on reducing the amount of code you have to type.

Type Aliases come in handy when we want to kind of rename the types.
For example if you don't like to write <> each time for a HashSet then you can create a Type Alias for it.

`typealias` in Kotlin is like the `typedef` in C language.

Infact, StringBuilder in Kotlin is just a type alias to Java's StringBuilder.

In TypeAliases.kt :

`@SinceKotlin("1.1") public actual typealias StringBuilder = java.lang.StringBuilder`

To create a custom type alias:

`typealias StudentSet = Set<Student>`

Now you can use the StudentSet to declare a variable:

`val students: StudentSet`

The Intelli-Sense will start suggesting the type aliases as soon as you define them.