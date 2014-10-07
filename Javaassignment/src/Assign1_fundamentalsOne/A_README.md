**1-3: DataTypes, Identifiers & Litersls:**  
Any programs created? Yes:
Program Name: Exer1_DataTypes.java

byte, short, int, long, char, float, double & Boolean. These are primitive datatypes regular datatypes which are used in other languages also. Since Java uses these too so java is not considered pure OOPS language. 
How java uses them: There are some wrappers are available they make primitive datatypes into objective datatypes. The wrappers are:
- Byte, Short, Integer, Long, Float, Double, Char and Boolean.   
- short, byte, int and long are also called numerical datatypes.  
- Float/double: If you don’t add ‘f’ at end of float value, java consider that value as double.  
- It is not possible to convert double to float but float to double is possible  

Default values  
- int – 0  
- boolean – false  
- char – space  
Char can only take single characters.   
- char my = ‘c’; /valid  
- char my = ‘char’ /not valid  
- String my = “char” /valid  
- String my = “c”; /valid  
String is not primitive data type. it is a class/API.  

Datatypes, identifies and literals.  
Int aim = 1000; Here,    
- Datatype is int  
- Identifier is aim  
- value/literal is 1000   

**2: Identifiers:**  
How to declare/define a identifier and its rules.  
Assignments: NO

**3: Literals:**   How to initialize a value/literal to all datatypes and their conversion  
Any programs created? No
******************************************************************************
**4: Java Keywords:**  
Keywords of each category.  
Any programs created? No  
**Break:** This is used to break the loop and come out of the loop. Basically, control goes out of the loop and start execute the next line out of the loop.  
**Continue:** Continue says, don’t execute next lines of the code inside this loop but go to first line of the code in the loop and start execute from there. Basically if you want to check the loop condition in between loop, you can use continue.

*****************************************************************************
**5: Variable types & their scope:**  
Any programs created? Yes  
1: Exer5_VariablesAndMethods_BothStaticAndInstance
2: Exer5_BothStaticInstanceVariablesAndMethodsSuperclass
3: Exer5_BothStaticInstanceVariablesAndMethodsSubclass

**Instance, static and Local & Final variables:**    
**Static variables:** will be declared only in class level not in method block, you can’t change static variable value but can access in both static and non static method

**Final variables:** If you prefix variable with final, then you can’t change its value later.   
final int m =100; // So this is also instance variable.

| Static|Instance|Local|
|-------------|-------------|-------------|
| Declared only at class level. Can't be declared in method level/block.| Declared at class level.| Declared only with in a block/method|
| Value of variable can't be changed|Value of variable can be changed| Variable can't be accessed without block so value cant be changed|
|Value of variable can't be changed | Value of variable can be changed|Variable can't be accessed without block so value cant be changed |  
|Can access everywhere including in static and non static methods | Can access only in non static methods. Static methods can't use instance variable.|Local variable can be used with in a block. Can't be accessed outside of a block |  
| It can be accessed directly, or by using object to that class, or by using classname.|To access instance variable outside the block. You need help of classname or object of that class. You can't call it directly. |it can't be accessed outside of the block. |  
|1: No need to initialize while declaring it, by default it get null/0 value. 2: Final static variables must be initialized before class loaded into memory. otherwise compile time error. i.e we can perform initialization for the final static variables at one of the following places. 1. at the time of declaration. 2. 2. inside the static initialization block. Example: final static int I; static{ int i=30; } | 1:  No need to initialize while declaring it, by default it get null/0 value. 2: But For the final instance variables ,we should perform initialization other wise compile time error. The final instance variable must be initialization before constructor compiles.i.e at the time of declaration or inside instance initialization block or inside constructor. Example: final int i; public static void main(String arg[]) { Sample s=new Sample() System.out.println(s.i); // invalid }| value needs to initialized before using it otherwise it will get CTE error|

******************************************************************************
**6: Arrays:**  
Arrays: declaration, initialization, construction  
Any programs created: yes  
Program Name: Exer6_ArraysDeclaration

*****************************************************************************
**7: Operators & Assignments:**  
Any programs created: No  
• equality(==,!=)  
• relational  
• bit-wise  
• short-circuit  
• instanceof  
• cast  
• conditional(?)  
• new  
• [ ]  
• Compound


****************************************************************************
**8. TYPE CASTING**  
**TypeCasting:** There are two types of typecasting.
  1: Primitive and  
  2: Objective.  
Both have again two types of categories. Implicit and explicit.   
Implicit means, JVM will take care while execution.  
Explicit means, you have to tell JVM when you code it.

**1: Primitive type casting:**  
byte --> short --> int --> long --> float --> double   
char --> int --> long --> float --> double  
That means, byte can directly convert into int. In above two diagram, jvm converts forward typecasting. That means, byte --> short, byte --> int, int --> float but not long --> int or int --> byte.

******************************************************************************
**9: Flow controls or statements:**    
Any programs created: No  
1: Selection statement : If-else & Switch  
2: Iteration statement : For, For-each, While, Do-while  
3: Transfer statement : Break, continue, return, try-catch-finally & assertion  
4: Do-while vs While: They are quite opposite  
5: While: As usual like others, it will check the condition first then execute the statement.  
6: Do-while: It is opposite to while. it executes the statement then checks the condition.

******************************************************************************
**10: Coding standards:**   
How to define name of classes, objects, variables,packages…  
Any programs created: No

******************************************************************************
**11: Import package:**     
Any programs created: No  
Basically here we talk about java source structure, the order is  
- Package statement  
- Import statement    
- Class/interface/enum declaration  
For ex:   
Package com.sample.one  
Import java.math;  
Public class superclass()  
{  
}  
Superclass inside “one”, One is inside “sample”, sample is inside “com”.  
Com > sample > one > Superclass.  
Superclass wants to inherit all math classes so it is importing.

******************************************************************************
**12: Main method**    
**Main method** : public static void main(String args[])  
Any programs created: No  
Public static void main(String args[])  
{  
}  
**Public:** We use public to give access to outsider of main. Since Java programs  
executed from main line, so JVM has to access main method, that means outsiders needs to access this. So main always should be public.  
**Static:** Using static we allocate some memory for main method. So it should be
always static. In any program language the code should be saved into memory with some references. In java, objects does this task, basically they allocate memory for methods/variables.  Since main method has no object so Static allocates memory for main method.    
**Void:** We don’t return anything from main, so its always void.  
**String args[]** : It means, main method is expecting array of strings. That means, for ex: if you are creating a website, then you want to user to enter dynamic values every time, then you can give array of strings.   
Create below class and then right click > run as > run configuration > arguments > enter 10 30 > then apply> then it will print 10 & 20 as output. 

Class super  
{ 
  Public static void main (String args[])
    {
      System.out.println(args[0]);
      System.out.println(args[1]);
    }
}

Output:  
10  
20

What if you don’t pass dynamic values: JVM will pass empty array or null.
  System.out.println(args[0]);  
Output:  
Java.lang.string@1...9



