 # Annotations in Java

> Annotations are used to provide supplemental information about a program. 

* Annotations start with `‘@’`.
* Annotations do not change the action of a compiled program.
* Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
* Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for example.
* Annotations basically are used to provide additional information, so could be an alternative to XML and Java marker interfaces.

<br>


## Hierarchy of Annotations in Java 

<br>
<p align=center>
<img src=JavaAnnotations.jpg width= 500px>
<p>
<br>

Example: 
```java
/ Java Program to Demonstrate that Annotations
// are Not Barely Comments
 
// Class 1
class Base {
   
    // Method
    public void display()
    {
        System.out.println("Base display()");
    }
}
 
// Class 2
// Main class
class Derived extends Base {
   
    // Overriding method as already up in above class
    @Override public void display(int x)
    {
        // Print statement when this method is called
        System.out.println("Derived display(int )");
    }
 
    // Method 2
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of this class inside main()
        Derived obj = new Derived();
 
        // Calling display() method inside main()
        obj.display();
    }
}

```
<br>

## Categories of Annotations
There are broadly 5 categories of annotations as listed:

1. Marker Annotations
2. Single value Annotations
3. Full Annotations
4. Type Annotations
5. Repeating Annotations
   
<b>Category 1: Marker Annotations</b>
The only purpose is to mark a declaration. These annotations contain no members and do not consist of any data. Thus, its presence as an annotation is sufficient. Since the marker interface contains no members, simply determining whether it is present or absent is sufficient. @Override is an example of Marker Annotation. 

```java
@TestAnnotation()
```
<br>

<b>Category 2: Single value Annotations</b>
These annotations contain only one member and allow a shorthand form of specifying the value of the member. We only need to specify the value for that member when the annotation is applied and don’t need to specify the name of the member. However, in order to use this shorthand, the name of the member must be a value. 

```java
@TestAnnotation(“testing”);
```

<br>

<b>Category 3: Full Annotations</b>
These annotations consist of multiple data members, names, values, pairs. 

```java
@TestAnnotation(owner=”Rahul”, value=”Class Geeks”)
```

<br>

<b>Category 4: Type Annotations</b>
These annotations can be applied to any place where a type is being used. For example, we can annotate the return type of a method. These are declared annotated with @Target annotation.

<br>

<b>Category 5: Repeating Annotations</b>
These are the annotations that can be applied to a single item more than once. For an annotation to be repeatable it must be annotated with the @Repeatable annotation, which is defined in the java.lang.annotation package. Its value field specifies the container type for the repeatable annotation. The container is specified as an annotation whose value field is an array of the repeatable annotation type. Hence, to create a repeatable annotation, firstly the container annotation is created, and then the annotation type is specified as an argument to the @Repeatable annotation.

<br>

## Predefined/ Standard Annotations
Java popularly defines seven built-in annotations as we have seen up in the hierarchy diagram.

* Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
** Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings

<b>Annotation 1: @Deprecated </b>

* It is a marker annotation. It indicates that a declaration is obsolete and has been replaced by a newer form.
* The Javadoc @deprecated tag should be used when an element has been deprecated.
@deprecated tag is for documentation and @Deprecated annotation is for runtime reflection.
* @deprecated tag has higher priority than @Deprecated annotation when both are together used.

```java

public class DeprecatedTest
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
 
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}
```

<br>

<b>Annotation 2: @Override</b>
It is a marker annotation that can be used only on methods. A method annotated with @Override must override a method from a superclass. If it doesn’t, a compile-time error will result (see this for example). It is used to ensure that a superclass method is actually overridden, and not simply overloaded.

```java
// Java Program to Illustrate Override Annotation
 
// Class 1
class Base
{
     public void Display()
     {
         System.out.println("Base display()");
     }
      
     public static void main(String args[])
     {
         Base t1 = new Derived();
         t1.Display();
     }    
}
 
// Class 2
// Extending above class
class Derived extends Base
{
     @Override
     public void Display()
     {
         System.out.println("Derived display()");
     }
}
```

<br>

<b>Annotation 3: @SuppressWarnings </b>
It is used to inform the compiler to suppress specified compiler warnings. The warnings to suppress are specified by name, in string form. This type of annotation can be applied to any type of declaration.

Java groups warnings under two categories. They are deprecated and unchecked. Any unchecked warning is generated when a legacy code interfaces with a code that uses generics.

```java
// Java Program to illustrate SuppressWarnings Annotation
 
// Class 1
class DeprecatedTest
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
}
 
// Class 2
public class SuppressWarningTest
{
    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}

```
<br>

<b>Annotation 4: @Documented</b>
It is a marker interface that tells a tool that an annotation is to be documented. Annotations are not included in ‘Javadoc’ comments. The use of @Documented annotation in the code enables tools like Javadoc to process it and include the annotation type information in the generated document.

<br>

<b>Annotation 5: @Target</b>
It is designed to be used only as an annotation to another annotation. @Target takes one argument, which must be constant from the ElementType enumeration. This argument specifies the type of declarations to which the annotation can be applied. 

<br>

<b>Annotation 6: @Inherited</b>
@Inherited is a marker annotation that can be used only on annotation declaration. It affects only annotations that will be used on class declarations. @Inherited causes the annotation for a superclass to be inherited by a subclass. Therefore, when a request for a specific annotation is made to the subclass, if that annotation is not present in the subclass, then its superclass is checked. If that annotation is present in the superclass, and if it is annotated with @Inherited, then that annotation will be returned. 

<br>

<b>Annotation 7: User-defined (Custom)</b>
User-defined annotations can be used to annotate program elements, i.e. variables, constructors, methods, etc. These annotations can be applied just before the declaration of an element (constructor, method, classes, etc). 
