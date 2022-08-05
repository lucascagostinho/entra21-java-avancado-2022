# Lambda Expressions

> Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. 

An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces lambda expressions are added in Java 8 and provide below functionalities.
* Enable to treat functionality as a method argument, or code as data.
* A function that can be created without belonging to any class.
* A lambda expression can be passed around as if it was an object and executed on demand.

Sintax:
```java
 lambda operator -> body
 ```

 ## Important points:

* The body of a lambda expression can contain zero, one or more statements.
* When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression.
* When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type of the anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.