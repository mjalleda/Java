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
ArrayList  
Vectors  
LinkedList    
Stack.    
7. Size (arrayList, linked list, vector list and stack) grows dynamically for collections unlike concrete classes.   8: Even, List & sets share common methods like Iterator.    
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

**3: What is the purpose of Lists & Sets:** Usually, in most of the projects there would be some requirements like transferring set of values. You can insert all those values into one array and pass that array in between layers. So all these are different types of arrays. Some allow duplicates some doesn’t. In some order is preserved in some order is not preserved. So main purpose is: To transfer a set of values in between layers, we use Lists & Sets. 

**4: Memory management:** In arrayList & vector, if you change/update/modify any value, JVM will create a new Object inside memory location and update there and removes the existing one. Hence, memory management is not good in Array list & Vector. But in LinkedList case, it doesn’t happen. JVM doesn’t create a new object, it just updates the existing one. So memory management is good in LinkedList.  
Summary: ArrayList & vector are good. LinkedList is bad.

**5: Performance:** Since vector is very old, it doesn’t allow multiple threads to access its methods. For ex: addmethod can be used by one user/thread at one time. But this is opposite in ArrayList & LinkedList, since they are not legacy classes, they allow multiple threads at one time to access one method.  
Summary: ArrayList & LinkedList are good. Vector is bad.

**6: Random access Interface:** Since this mechanism is implemented on ArrayList & Vector, so user can rapidly access/search values, since this is not implemented on LinkedList, user can’t do rapid search for values in LinkedList.   
Summary: ArrayList & LinkedList are good. 

**7: Difference between all three. ArrayList, LinkedList and Vector.**  

|  ArrayList |Vector |LinkedList|
| ------------- |-------------| -----|
|Memory Management Is not good: Update/modify: If you update a value in the ArrayList, JVM will create a new memory for the ArrayList and point it to that one, later it will remove the old memory location. Memory allocation is not good for Array list   | Memory Management Is not good:Update/modify: If you update a value in the Vector, JVM will create a new memory for the Vector and point it to that one, later it will remove the old memory location. Memory allocation is not good for Vector|Memory Management is good:Update/modify: If you update A value in the LinkedList, JVM will not create a new memory for the linkedList, it updates existing one. So memory management is good on LinkedList.|
|Performance on accessing values is good:  wise Array list is good since it allows multiple threads to access same method at same time. For ex: If 10 users want to access addmethod in ArrayList, it allow all 10 users at same time.   | Performance on accessing values is Bad:Performance wise Vector is BAD since it doesn't allow multiple threads to access same method at same time. For ex: If 10 users want to access addmethod in Vector, it allow 1 user at one time.|Performance wise LinkedList is good: Performance wise Linked list is good since it allows multiple threads to access same method at same time. For ex: If 10 users want to access addmethod in LinkedList, it allow all 10 users at same time.|
| Search criteria: ArrayList is good for searching values. For searching ArrayList is good. Since 'random access' interface is implemented on it, so this mechanism allow user to search values rapidly on Arraylist  | Search criteria: Vector is good for searching a value. For searching Vector  is good. Since 'random access' interface is implemented on this also, so this mechanism allow user to search values rapidly on Vector.|Search criteria: LinkedList is bad to search for an item. For searching LinkedList  is veryBAD. Since 'random access' interface is NOT implemented on this, so JVM takes lot of time to search a value on LinkedList.|
| You can use for & for each loop. Since all lists are index based.  |You can use for & for each loop. Since all lists are index based. |You can use for & for each loop. Since all lists are index based.|
| All three are used to transfer set of values (in a object) from one layer to another layer. Or from one place to another place. For ex: transferring from DEO to Service layer.  | ||
| ArrayList is not legacy class  | Vector is a legacy class|LinkedList is not legacy class|

******************************************************************************  
**3: All Sets Classes**

**Sub-Topics:**  
1: Sets & Hirarchy.  
2: Difference between Hashset & ListHashSet  
3: How HashSet/Linked Hashset removes duplicates & compare   
4: Diff between System.identityHashcode  and hashcode.  
5: How SortedSet & TreeSet removes duplicates & sorts?

**1: Sets & Hirarchy**  
In Sets,   
Interfaces are:  Set & Sorted Set   
Classes are: HashSet & LinkedHashSet & TreeSet.

1: Sets is a interface which implements collection interface  
2: Sets: In the map:  
- Collection is a interface  
- Set is interface which implements Collection  
- HashSet is a class which implements collection & set interfaces.  
- SortedSet is a interface which implements Set & Collection interfaces.  
- LinkedHasSet is a class which extends HashSet.  
- Again Treet Set is a class which extends SortedSet.  

3: Purpose is of Sets is same as Lists : the only difference is, it doesn’t allow duplicates. 

**2: Difference between Hashset & ListHashSet**    

|  HashSet |LinkedHashSet |
| ------------- |-------------|
| Both are from Sets  | |
| HashSet is parent for LinkedHashSet.   | |
|LinkedHashSet - order is not preserved. It return values based on value hashcode.   |LinkedHashSet - order is not preserved. It retunr values in the order they are initialized. |

