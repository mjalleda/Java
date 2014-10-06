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

Instance, static and Local & Final variables:  
**Static variables:** will be declared only in class level not in method block, you can’t change static variable value but can access in both static and non static method

**Final variables:** If you prefix variable with final, then you can’t change its value later.   
final int m =100; // So this is also instance variable.

| Static        |Instance      | Local |
| ------------- |:-------------:|------:|
| Declared only at class level. Can't be declared in method level/block.| Declared at class level.| Declared only with in a block/method|
| Value of variable can't be changed|Value of variable can be changed| Variable can't be accessed without block so value cant be changed|


