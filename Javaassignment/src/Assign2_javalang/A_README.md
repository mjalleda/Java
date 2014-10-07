Here, you will find java.lang API classes & their details. 

**java.lang APIs**  
1: Class  API & Object API  
2: Enum  
3: String API  
4: string buffer API and StringBuilder API  
5: Cleanable and Comparable  
6: Wrapper APIs/Classes   
7: Math Class/API  
8: Autoboxing and Autounboxing  
9: System API/class

*****************************************************************************  
**1: Class API & Object API**  
1: Multiple Inheritance  
2: HashCode  
3: “Class” class OR “Class API”:  
4: Why do we need to create an object in order to return a class’s methods or properties.   
5: What is the difference between a class and Class API:  
6: Create a method with classname.

**1: Multiple inheritance:**  Object is a super class of any java class .All the predefined classes are user defined classes. They either directly or indirectly extends java.lang.objectclass.  
For every class parent class in object class. Take below example. A is child and B is parent class. Where A is extending B class. But B extends Object class directly/indirectly. That means, java supports multilevel inheritance.  
Object Class > Class B > Class A.  
        Class A extends B  
        {  
        // code  
        }
       
       Class B extends Object {  
       // code   
       }

**2: Hashcode:** In generally, all objects/variables/all stores in memory. System provides an id to each object in memory for identification. This id is called hashcode. All objects/classes/variables contains hashcode. 
|1234444|34333|4444888|9843549|
-------- ----- ------- -------
|Obj1|Obj2|Obj3|Obj4|


The following are called hashcodes. 1234444,  34333,  4444888 & 9843549.  
Object.hashcode – to return hashcode for a object  
Object.string – the string representation of hashcode of an Object  
Object.clone – to make a copy of object  
Object.Equal – to compare hashcodes of two objects and return Boolean results true or false  
Object.finalize – to clean up the garbage collection.

Note: Here, Object is a class and all above are methods. You can also override these methods. For ex:  
Equal only compares hashcodes of two objects. It doesn’t compare two object properties and methods.   
So if you need it to compare values then you need to override Equal() method.

**3: “Class” Class OR “Class API”:** Java also have an API for “Class”. It has many properties and methods.   
Rule1: You need to tell this API  for which class you want to return methods/properties.  For ex: If you create classA, classB and so on…Provide classname to Class Class. i.e.,  
Class s = Class.forName(“classA”);  // Class is a return type and Class is JAVA API    
s.getPackage();  
s.getClass();  
s.getFields();  
s.getInterfaces(); // if any interface this class implements.  
s.IsAbstract(); r // return if class is abstract class. True or false

**4: Why do we need to create an object in order to return a class’s methods or properties.**  Basically in order to return a class properties and methods, we need to first store them in memory and should point a reference to that memory location. So here object points to that memory location and returns the properties and methods of a class.

Note: you need to add the below code to method where are you create an object for the Class API.  
throws ClassNotFoundException  
For ex:
        public static void  main(String args[]) throws ClassNotFoundException {    
         Class c = Class.forName("Remove");  
         System.out.println(c.getPackage());  
         String abc = c.getName();  
         System.out.println(abc);  
        }

**5: What is the difference between a class and Class API:** class is a keyword to declare/create a class. for ex: public class PublicA {}  
But Class API is a Java API which has properties and methods like any other class but which are defined by sun not by user. But in class user can declare all his properties and behaviors.

**6: Create a method with classname.**  
Every time method should tell what is the return type whether it is void or int or char. So it can also  tell the return type is a classt ype, that means the method returns an object for that class.

        Public classA {   // class A   
         int a;  
         char name;  
         int id;  
        }

        Public classB { // Class B  
         classB method() { // creating a method of classtype (this return an object)  
          classA Obj1 = new classA(); // creating object for classA  
          obj1.a = 10; 			// initializing values  
          obj1.name = ‘n’;  
          obj1.id = 100;  
          return obj1;		// returning object. A single obj contains 							multiple values.	  
        }

       Public static void main(String args[]) // Main method inside classB  
       {  
        ClassB obj2 = new ClassB;  		//creating object for classB   
        classA obj1 = obj2.method();		// calling classB method, that means you want to hold method’s behavior and           properties in obj1.   
        System.out.println(obj1.id+””+obj1.name+””+obj1.id);  
      }

It should print   
10  
N  
100
