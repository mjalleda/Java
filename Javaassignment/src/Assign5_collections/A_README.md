Collections:
-------------  
**Sub-Topics:**  
1: Collection Interface  
2: All Lists Classes  
3: All Sets classes  
4: All Maps Classes  
5: All Others:  
- Collection Class/API  
- Generics  
- String Tokenizer  
- Locale Class  
- Date API  
- Timer  
- Calendar  
- Comparator  
- Cursors.

*****************************************************************************
**1: Collection Interfaces.**

**1: Layers in most of programming applications:**


**2: Collections:**  
Collection is nothing but collection of objects OR set of objects. 
Basically, collection contains all objects.  If you look into the below diagram you understand that Collection is the superclass for all. Where List & Set are subclasses of Collection (Actually, if you look into any collection hierarchy they don’t show AbstractList).  ArrayList, Vectors, LinkedList are subclasses of List.  HashSet and sorted set are subclasses of SetInterface.   The last level you can see in below diagram.   
1: Collection is a interface it can contain only abstract methods. 

Here is a hierarchy of Collection Interfaces:  
**Interfaces:** are:  
- Collection  
- Lists  
- Sets  
- Sorted Set  
- Map  
- Sorted Hash Map    

**Classes:** are:   
- ArrayList  
- LinkedList  
- Vector  
- Stack  
- HashSet  
- LinkedHashSet  
- TreeSet  
- HashMap  
- Weak hashMap  
- Identity HashMap  
- TreeMap  
- Hashtable.

Maps represent mappings rather than true collections. However, these interfaces contain collection-view operations, which allow them to be manipulated as collections.

*****************************************************************************				  
**2: All Lists Classes**

**Sub-Topics:**  
1: Lists & Diagram :    
2: Difference between Lists & Sets  
3: What is the purpose of Lists & Sets.   
4: Memory management:  
5: performance  
6: Random access interface  
7: Difference between all three. ArrayList, LinkedList and Vector.


**1: Lists & Diagram:**


In Lists,   
Interfaces are: Lists  
Classes are:  ArrayList, LinkedList, Vector & Stack.

1: List is a Interface which implements Collection Interface methods.  
2: Lists are index based. Means, each value get a position. For searching, we can use index/position to retrieve a value.  
3: The following are ListInterface methods.   
- 1.boolean add(Object obj)  
- 2.boolean add(int index,Object o)  
- 3.boolean addAll(Collection c)  
- 4.boolean addAll(int index,Collection c)  
- 5.boolean remove(object o).  remove the first occurrence of this object  
- 6.boolean removeAll(Collection c)  
- 7.int indexOf(Object o). return the index of first occurrence. returns -1 if there is no such object  
- 8.int lastIndexOf(Objetc o)  
- 9.Object get(int index). there is no get method in the collection interface  
- 10.Object set(int index , Object o)  
- 11.ListIterator listIterator()  
- 12.Object remove(int index)

4: AbstractList is a abstract class, which extends both Collections & LinkedList interfaces. Then implements body for some methods of collections and Lists. Why some methods only? Let say for ex: Collection have 10 methods, LinkedList have 8 methods, Total 18 methods should be implemented by below classes.   
- ArrayList  
- VectorList  
- LinkedList  
- Stack    

But for ex: if all above classes implemented some methods, let say if 6 methods in same manner (no change at all, and output also same) then why to write in four classes, write it in one location and access it from there. So that common location is AbstractList class.  
5: Remember Collection,List & Sets are Interfaces. AbstractClass is a abstract class & all others are regular classes.    
6. Most commonly used are Lists are     
- ArrayList  
- Vectors  
- LinkedList    
- Stack.
7. Size (arrayList, linked list, vector list and stack) grows dynamically for collections unlike concrete classes.  
8: Even, List & sets share common methods like Iterator.  
9: All lists & sets holds objects, by default its size is 10 but JVM dynamically grows its size.  
10: List & Sets can have, wrapper class object, Object class object, another class (for ex: employee) class object and also directly primitive values are allowed. For theory we say, primitives are not allowed in Collections, but if you initialize some primitive values in array list, JVM in the background it runs autoboxing and autounboxing mechanism and convert them into wrapper classes.  
11: you need to import to all Lists and Sets and collections. For ex:   
. import java.util.ArrayList;  
. import java.util.LinkedList;  
. import java.util.Enumeration;  
. import java.util.Vector;  
. import java.util.ListIterator;


**2. Difference between List & Set.**
| Lists        |      Sets      |
| ------------- |-------------|
|Both are used to transfer set of values (using objects) in between layers like control, service or DEO.| |
|Both are used to search values on an Object (of set of values).| |
|But Lists allows duplicate values to print/add. |Set Doesn’t allow duplicate values. It removes duplicate while retrieving. |
|List allow multiple null values to be in the list.| But Set doesn’t allow more than one null value. It only return one null values if it has multiple.|
|List returns the order of values in the order they are initialized.|In set order is preserved( except LinkedHashSet). |
|Widely used are Lists.|If you don’t want duplicates then use sets. |
|List uses both For and Foreach. Because it is index based.|Since set is not index based it doesn’t allow forloop. Only allows foreach loop.|
