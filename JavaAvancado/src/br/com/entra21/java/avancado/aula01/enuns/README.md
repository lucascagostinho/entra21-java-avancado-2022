# ENUMS in Java

> Enumerations serve the purpose of representing a group of named constants in a programming language. For example, the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an enumerated type named Suit. Other examples include natural enumerated types (like the planets, days of the week, colors, directions, etc.). 
Enums are used when we know all possible values at compile-time, such as choices on a menu, rounding modes, command-line flags, etc. It is not necessary that the set of constants in an enum type stay fixed for all time.

<br>

## Declaration of enum in Java
Enum declaration can be done outside a Class or inside a Class but not inside a Method:

```java
enum Color {
    RED,
    GREEN,
    BLUE;
}
 
public class Test {
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
```
<br>

### Important Points of enum:  

* Every enum is internally implemented by using Class;
* Every enum constant represents an object of type enum;
* enum type can be passed as an argument to switch statements; 
* Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. Since it is final, we can’t create child enums;
  
<br>

## Enum and Inheritance:
* All enums implicitly extend ``java.lang.Enum class``. As a class can only extend one parent in Java, so an enum cannot extend anything else;
* `toString()` method is overridden in ``java.lang.Enum`` class, which returns enum constant name;
* enum can implement many interfaces.

<br>

## values(), ordinal() and valueOf() methods:  
* These methods are present inside ``java.lang.Enum``;
* ``values()`` method can be used to return all values present inside the enum;
* Order is important in enums.By using the ``ordinal()`` method, each enum constant index can be found, just like an array index;
* ``valueOf()`` method returns the enum constant of the specified string value if exists.

<br>

## enum and constructor:  
* ``enum`` can contain a constructor and it is executed separately for each enum constant at the time of enum class loading;
* We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
  
 <br>

## enum and methods:  
* ``enum`` can contain both ``concrete methods and abstract methods``. If an enum class has an abstract method, then each instance of the enum class must implement it.
