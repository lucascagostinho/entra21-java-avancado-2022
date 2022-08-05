#  Collections Set (HashSet)

>The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time. This class permits the null element. The class also offers constant time performance for the basic operations like add, remove, contains, and size assuming the hash function disperses the elements properly among the buckets, which we shall see further in the article.  

<br>

## A few important features of HashSet are: 

* Implements Set Interface.
  
* The underlying data structure for HashSet is Hashtable.
  
* As it implements the Set Interface, duplicate values are not allowed.
  
* Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
  
* NULL elements are allowed in HashSet.
  
* HashSet also implements Serializable and Cloneable interfaces.

<br>

## The Hierarchy of HashSet

HashSet extends Abstract Set<E> class and implements Set<E>, Cloneable, and Serializable interfaces where E is the type of elements maintained by this set. The directly known subclass of HashSet is LinkedHashSet.

Now for the maintenance of constant time performance, iterating over HashSet requires time proportional to the sum of the HashSet instance’s size (the number of elements) plus the “capacity” of the backing HashMap instance (the number of buckets). Thus, it’s very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important. 

Initial Capacity: The initial capacity means the number of buckets when hashtable (HashSet internally uses hashtable data structure) is created. The number of buckets will be automatically increased if the current size gets full. 
 
Load Factor: The load factor is a measure of how full the HashSet is allowed to get before its capacity is automatically increased. When the number of entries in the hash table exceeds the product of the load factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so that the hash table has approximately twice the number of buckets.

<br>

## Constructors of HashSet class
In order to create a HashSet, we need to create an object of the HashSet class. The HashSet class consists of various constructors that allow the possible creation of the HashSet. The following are the constructors available in this class.

1. HashSet(): This constructor is used to build an empty HashSet object in which the default initial capacity is 16 and the default load factor is 0.75. If we wish to create an empty HashSet with the name hs, then, it can be created as:

```java
HashSet<E> hs = new HashSet<E>();
```

2. HashSet(int initialCapacity): This constructor is used to build an empty HashSet object in which the initialCapacity is specified at the time of object creation. Here, the default loadFactor remains 0.75.

```java
HashSet<E> hs = new HashSet<E>(int initialCapacity);
```

3. HashSet(int initialCapacity, float loadFactor): This constructor is used to build an empty HashSet object in which the initialCapacity and loadFactor are specified at the time of object creation.

```java
HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);
```

4. HashSet(Collection): This constructor is used to build a HashSet object containing all the elements from the given collection. In short, this constructor is used when any conversion is needed from any Collection object to the HashSet object. If we wish to create a HashSet with the name hs, it can be created as:

```java
HashSet<E> hs = new HashSet<E>(Collection C);
```

<br>
<br>

## Methods in HashSet

|       Method       |                                 Description                                    |
| :----------------: | :----------------------------------------------------------------------------: |
| add(E e)           | Used to add the specified element if it is not present(if it's false = false). |
| clear ( )          | Used to remove all the elements from set.                                      |
| contains(Object o) | Used to return true if an element is present in set.                           |
| remove(Object o)   | Used to remove the element if it is present in set.                            |
| iterator( )        | Used to return an iterator over the element in the set.                        |
| isEmpty( )         | Used to check whether the set is empty or not;                                 |
| size( )            | Used to return the size of the set.                                            |
| clone( )           | Used to create a shallow copy of the set.                                      |
