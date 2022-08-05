# Collections Map (HashMap)

> HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in java.util package. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass.

 ## Syntax
 
### Declaration
 
```java 
public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
```                          
### Parameters
 It takes two parameters namely as follows:
* The type of keys maintained by this map;
* The type of mapped values.
HashMap implements Serializable, Cloneable, Map<K, V> interfaces. HashMap extends AbstractMap<K, V> class. The direct subclasses are LinkedHashMap, PrinterStateReasons.

### Constructors in HashMap
HashMap provides 4 constructors and the access modifier of each is public which are listed as follows:

1. HashMap();
2. HashMap(int initialCapacity);
3. HashMap(int initialCapacity, float loadFactor);
4. HashMap(Map map).
5. 
Now discussing above constructors one by one alongside implementing the same with help of clean java programs.

<b>Constructor 1: HashMap()</b>

```java
HashMap<K, V> hm = new HashMap<K, V>();
```
<br>

<b> Constructor 2: HashMap(int initialCapacity)</b>

```java
HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);
```

<br>

<b> Constructor 3: HashMap(int initialCapacity, float loadFactor) </b>

```java
HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, int  loadFactor);
```

<br>

4. HashMap(Map map):

```java
HashMap<K, V> hm = new HashMap<K, V>(Map map);
```