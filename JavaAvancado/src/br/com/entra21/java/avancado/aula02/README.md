# Collections in Java - ArrayList and LinkedList 

## ArrayList

> It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package.

<br>
<p align=center>
<img src=ArrayList.png width= 500px>
<p>
<br>

Since ArrayList is a dynamic array and we do not have to specify the size while creating it, the size of the array automatically increases when we dynamically add and remove items. Though the actual library implementation may be more complex, the following is a very basic idea explaining the working of the array when the array becomes full and if we try to add an item:

* Creates a bigger-sized memory on heap memory (for example memory of double size).
* Copies the current memory elements to the new memory.
* New item is added now as there is bigger memory available now.
* Delete the old memory.

<br>
<p align=center>
<img src=ArrayList2.png width= 500px>
<p>
<br>

1. <b>AbstractList</b>: This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.
2. <b>CopyOnWriteArrayList</b>: This class implements the list interface. It is an enhanced version of ArrayList in which all the modifications(add, set, remove, etc.) are implemented by making a fresh copy of the list.
3. <b>AbstractSequentialList</b>: This class implements the Collection interface and the AbstractCollection class. This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.

<br>

### Constructors in the ArrayList
In order to create an ArrayList, we need to create an object of the ArrayList class. The ArrayList class consists of various constructors which allow the possible creation of the array list. The following are the constructors available in this class:
 
1. ArrayList(): This constructor is used to build an empty array list. If we wish to create an empty ArrayList with the name arr, then, it can be created as:

```java
ArrayList arr = new ArrayList(); 
``` 

2. ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from the collection c. Suppose, we wish to create an ArrayList arr which contains the elements present in the collection c, then, it can be created as: 
 
```java
ArrayList arr = new ArrayList(c); 
``` 

3. ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified. Suppose we wish to create an ArrayList with the initial size being N, then, it can be created as:

```java
ArrayList arr = new ArrayList(N);  
```