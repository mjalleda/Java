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


******************************************************************************
**13: Access Modifiers/Access Specifiers**    
Below are called Access Modifiers:  
Public, Private, Protected, Default, static, final, abstract, strictfp, native  
Notes:   
- The allowed modifiers for the Top level classes are : 1.public 2.default 3. final 4.abstract 5. Strictfp, 6: Abstract    
- The allowed modifiers for the method level are 1.public 2.default 3. Private 4.protected 5. Final, 6: static 7: Abstract  
- The allowed modifiers for the variables  
- Final, public, protected, default, private and static.
For ex: Package 1 have class1 and class2. Package 2 contains : Class3 & Class4.

**1: Public:** Accessed everywhere (refer to diagram in the notes).   If public defined in class1, it can be accessed in class2, packag1, and all classed in packag2. 

**2: Private:** If it is defined in class1, it can be accessed only to class1, not to class2, or packag2. 
It is accessible within the block/class/method. Private not allowed for top level class.  That means, only for variable/methods. 

**3: Default:** By default, variables/methods/classes are available to within the package, not outside the package. If a class declared as the default ,we are allowed to access that class only with in the current package.outside package can’t access this. If a method declared as the default ,that member is visible with in the current package only.

**4: Protected:** This is accessible within the package + subclasses. It is not defined at class level. That means, only members/methods can define as protected.  

**5: Final:** Final means, you are making methods/classes as constants, that means you can’t override/extend them.  
**5.1: Rule1/Final class:** You can’t use extend keyword in subclass/other classes to call Final class. For ex: if Final class contains final methods, subclass don’t extend Final class, so that means there is no relationship between final class and subclass, so subclass can contain same signatures/methods of final methods in subclass. Here, we realized that final class can’t be extended in other classes.

**5.2: Rule 2/Final methods:** For ex, if concrete class ‘A’ contains final methods, if subclass ‘b’ extends class ‘A’, then it can’t override ‘final methods of A in B’. It will get an error. That means, you can’t override final methods. Here we realized that, a concrete class can contain final methods.   

**5.3: Rule 2/Final variables:** For ex, if concrete class ‘A’ contains final variables, if subclass ‘b’ extends class ‘A’, then it can’t re-initialize/override ‘final variables of A in B’. (Usually, you re-produce this error by 
Creating a parent reference in sub class, then try access final variables using the object, then it will show you the error.

So you don’t extend final class , then subclass may contain same signatures o

**5.4: Final Methods :** if you add final in front of methods, that method becomes constant and in other subclasses, these can be accessible but can’t be overide.

**5.5: Final classes:** If you add final in front of class, that class becomes constant and in other sub classes, these can be accessible by objects, but can’t create the child class.
We can implement security by final.

**6: Abstract**  
**6.1: Abstract with static method is not valid. Why?** 
Because, static means constant and you can’t change, but abstract means you can’t do implementation with in the method, so if you do implementation in different class first you need to access the method, since it is static you can’t change it. SO ABSTRACT STATIC METHOS IS NOT POSSIBLE.

**6.2: Abstract with final method is not valid. Why?**   
If a class declared as the abstract ,we should create the child class to provide implementation for abstract methods.  
If a class declared as the final ,you are not allowed to create the child class.Hence final and abstract combination is illegal for classes.

**7: Static:** The keyword static can be use for classes,methods, variables  
We can not apply static keyword for the top level classes,but we can apply inner classes.  
For every object a separate copy of instance variables will be created but in the case of static variables a single copy will be created at the class level and shared by all the objects of that class.

**8: Native:** Native means, you can use c/c++ code with in java class by making some configuration changes. But how to write c/c++ code in java.  For ex: There is a requirement that we need add Client API/Classes/code into our code, so our application can analyze client's data. But client code is in c/C++ and ours is in Java. How is it possible?
Basically, java allow a method called ‘addLibrary’. If you keep the client code in local machine, then you can add that api into our java program by ‘addLibrary’ method.  
If you know a method exists in C/C++ api, then you can define that method with native. 

**9: Strictfp:** Basically you are strictly maintaining a structure for floating point variables.   
Why it is introduced? : Before java 1.4, floating point variables to take 32 bits if OS is 32 bit OS, otherwise it takes 64bits if OS is 64bit OS. Code may not run if you run the 32 bit code on 64 bit and vise versa.
To avoid this problem, java introduced Strictfp. Basically we define Strcitfp for classes not for methods or variables. Inside that class, all floating point variables take same number of decimal points that you have. Basically it goes by IEEE standards.


******************************************************************************
**14: Variable argument method**  
Any programs created: NO  
This is 1.5 feature. variable argument methods (var-arg methods)allow us to specify that a method can take multiple arguments of the same type and allows the number of arguments to be variable.  

             Void m1(int..i)  
		{  
			….  
		}
	 	Public static void main (String args[])
                {
                	System.out.println(args[0]);
                	System.out.println(args[1]);
                }
		}

