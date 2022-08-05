# Wrappers in Java

> A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

<br>

## Need of Wrapper Classes
<br>

1. They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value);

2. The classes in java.util package handles only objects and hence wrapper classes help in this case also;
   
3. Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types;

4. An object is needed to support synchronization in multithreading.

<br>

## Primitive Data types and their Corresponding Wrapper class

<br>
<p align=center>
<img src=Wrapper-Class-in-Java.png width=500px heigth= 700px>
<p>
<br>

## Autoboxing and Unboxing 

* Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of `int to Integer, long to Long, double to Double` etc.
Example:

```java
// Java program to demonstrate Autoboxing
  
import java.util.ArrayList;
class Autoboxing
{
    public static void main(String[] args)
    {
        char ch = 'a';
  
        // Autoboxing- primitive to Character object conversion
        Character a = ch;
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
  
        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
  
        // printing the values from object
        System.out.println(arrayList.get(0));
    }
}

```
<br>

* Unboxing: It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc.


```java
// Java program to demonstrate Unboxing
import java.util.ArrayList;
  
class Unboxing
{
    public static void main(String[] args)
    {
        Character ch = 'a';
  
        // unboxing - Character object to primitive conversion
        char a = ch;
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);
  
        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);
  
        // printing the values from primitive data types
        System.out.println(num);
    }
}

```