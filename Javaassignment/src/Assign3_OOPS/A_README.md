OOPS (Object Oriented Programming)
------  
**Sub-Topics:**  
1: Class API & Object APIs.  
2: Encapsulation  
3: Abstraction  
4: Inheritance  
5: Polymorphism  
6: Constructor

******************************************************************************
**1: Class Api & Object Api**  

**Class:** Class is nothing but a blueprint, it represents a house, person, animal. Which has specifications saying that it needs to have properties and methods.  
How java code gets into memory:   
- Any class contains either static variables/methods or instance variables/methods or both.   
- For static methods, Memory should be allocated when they get executed.  
- Instance variables can be executed only with an object. In java, you can’t directly execute/call instance variables/method. First you need to create object and then call/execute instance variables/methods. Memory should be allocated when object is created that means instance variables are getting to memory thru object not just by themselves like static variables/methods.  
- That means, java codes gets into memory in two ways. Thru static variables/methods or Objects (for storing instance variables/methods).

**Object:** Is an actual reference for all variables/methods in memory.

******************************************************************************
**2: Abstraction:**  
- Hiding variables/methods/implementation of a class is called Abstraction, means everything should be defined as private.  
- This just a concept and there is no keyword for it  
- Basically most of the files in finance application should be abstracted. 

******************************************************************************
**3: Encapsulation**  
This also a concept not a keyword.  
- If all variables/methods in a class are declared as private, that class is called tightly encapsulated.  
- Encapsulation is tide with class not with variables/methods. If a class contains both private and public/protected/default, that class is called is not completely encapsulated.

******************************************************************************
**4: Inheritance**  
1: Creating a new class from existing class is called Inheritance.   
- This is a concept + we use keyword extends to inherit properties from parent.  
- You can extend one class but not multiple classes.  
- API classes can be accessible everywhere.  
- Levels of inheritance.   
- ParentClass > ChildClass extends ParentClass  > GrandChild c extends Parent.  
  That means,  ChildClass access all properties/methods of Parent.  
  But GrandChild can access all properties/methods of both ‘Parent’ & ‘ChildClass’.

**2: Difference between Extends keyword and parent reference/object.**  
- Main difference is you can’t override methods with our inheritance/extends.  
- Only you can access parent class methods/variable by parent reference not by child reference. With extend keyword, child reference also access parent’s variables/methods.