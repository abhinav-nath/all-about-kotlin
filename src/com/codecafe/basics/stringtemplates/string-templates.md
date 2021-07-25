## String Templates in Kotlin

Kotlin has an awesome feature called String Templates that allows strings to contain template expressions.

A String Template expression starts with a dollar sign `$`.

This concept is absent in Java.

### Raw Strings

In Kotlin, additionally, we have triple-quoted raw Strings that can contain special characters without the need for escaping them.

The resulting String is contained between two consecutive non-overlapping occurrences of triple double-quote-signs “.

For example, in Java, in order to create properly a String containing a Windows-style file path to a resource located at `C:\Repository\read.me`, we define it in this way:

```
String path = "C:\\Repository\\read.me"
```

In Kotlin, we may use the triple-quoted notation in order to achieve the same result:

```
val path = """C:\Repository\read.me"""
```

We may use this notation in order to create a multi-line String:

```
val receipt = """Item 1: $1.00
Item 2: $0.50"""
```

Which creates a String that spans exactly two lines. If we prefer this indentation:

```
val receipt = """Item 1: $1.00
>Item 2: $0.50""".trimMargin(">") 
```

We use a `trimMargin()` method that eliminates eventual white spaces from the start of every line up to the first occurrence of the margin prefix (> in the example above).

Triple-quoted strings don’t support any escape sequences. It means that if we wrote

```
val receipt = """Item 1: $1.00\nItem 2: $0.50"""
```

in order to get a two-line String, we’d get a single line containing the characters `\n` instead of the expected line break.

Triple-quoted Strings do support templating though.

It means that any sequence starting with the dollar sign gets resolved to a string in a way as we have described in the previous section.
We may use this fact in order to make the escape characters work:

```
val receipt = """Item 1: $1.00${"\n"}Item 2: $0.50"""
```