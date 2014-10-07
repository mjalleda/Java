EXCEPTIONS:
==============  

**Index**  
**1: Exceptions:**  
1. What is exception:  
2. Exception Hierarchy:  
3. Calling an object with their superclass names  
4. Types of exceptions: Errors & Exceptions.  
5. Checked & Unchecked exceptions.  
6. How to generate unchecked exceptions:   
7. Checked exceptions are:  
8. Custom exceptions:   
9. Purpose/Example of custom exceptions  

**2: Throw & Throws.**  
1. Throws:   
2. Purpose of Throws:  
3. Throw:   
4. Throws with Method Overrding :   
5. Throws with Constructor Overrding :   
6. Difference between Catch and Throws  
7. Difference between Throws & Throw  

**3: Try, Catch & Finally**  
1. Try and catch block:   
2. Catch block  
3. Finally block  
4. Valid & Invalid combination scenarios  
5. What is the purpose of having multiple catches :   
6. Rule

*****************************************************************************
**1:: Exceptions:**
**1: What is exception:**  
- 1: Unwanted unexpected event occurred while running, this is called exception.  
- 2: When exception occurs, runtime will stop execute the code where execution occurs.   
- 3: So we need to catch the exception and tell the complier to continue with next lines of the code.  
- 4: Every time JVM returns exception, it definitely return below parameters
Exception name, description and position.  
- 5: Exception looks like - Exception in thread "main" java.lang.ArithmeticException: / by zero at com.sample.exercise5_exceptions.exercise1_exception_arithmeticone.main(exercise1_exception_arithmeticone.java:12). In above example, Name is   Exception in thread "main" java.lang.ArithmeticException: / 
Description is by zero at com.sample.exercise5_exceptions.exercise1_exception_arithmeticone.m
Position is exercise1_exception_arithmeticone.java:12).  
- 6: Usually, java maintains a runtime stack to display printing statements on console. Whenever it runs code it runs from this stack and after running it empties the stack. For any reason, stack get full it stops the code execution and return stack overflow error.  
- 7: Since JVM maintains runtime stack so it displays exceptions on console.   
- 8: There are two different types of exceptions – Errors & Exceptions. Errors are non-recoverable & Exceptions are recoverable.

**2: Exception Hierarchy:**


**3: Calling an object with their superclass names**  
- 1: In this diagram Object is a superclass.  
- 2: Throwable is subclass of Object class  
- 3. Errors & Exceptions are subclass of throwable  
- 4. VMError, leakage error and assertion errors are subclass of throwable.  
- 5. out of memory errors and stack overflow memory error are subclasses of VMerror, etc. So, Out of memory error > VMerror > Error > Throwable > Object. If you want to call Out of memory error you can also call with its parents. For ex:
you can call Out of memory error object O with its superclasses also.   
Catch (Out of memory error O) { }; OR  
Catch (VMerror O) { }; OR  
Catch (Error O) { }; OR    
Catch (Throwable O) { }; OR  
Catch (Object O) { };

**4: Types of exceptions:**  
**Errors & Exceptions.**  
1: Are also called non-recoverable, that means you can’t catch them. That means, if non-recoverable error occurs, code will stop executing it ( may be it will crash ).  
2: Exception: are also called re-coverable, that means you can write catch them. But exception again  two types. Checked & Unchecked.

**5: Checked & Unchecked exceptions.**
Checked: Complier checks if any exceptions occurred and it immediately tells the user there is an checked exception. 
Unchecked: The exception will not checked by compiler are called unchecked exception. Basically, runtime will catch these exceptions and prints exception in console.

**6: How to generate unchecked exceptions:**  
1: Arithmetic exception: 10/0 – which is not possible, it returns arithmetic exception  
2: Nullpointer exception: Without completing object creation process, you can’t initialize an object. It returns nullpointer exception.  
3: IllegalstateException:  
4: IllegalArgumentException:  
5: ClasscastException:  
6: IndexOutofBoundException:  is two types.   
- ArrayIndexOutOfBound  
- StringIndexOutofBound: 

**7: Checked exceptions:** Are,  
1: SQL Exception  
2: Remote exception  
3: ClassnotFoundException  
4: IO Exception exception – it is three types:   
- EndofFile  
- Filenotfound  
- InteruptedIO

**8: Custom exceptions:**  
1: user defined exceptions are called custom exceptions.   
2: We can inherit/extend java defined exceptions.   
3: Custom exceptions always contains constructors with parametrized type.   
4: You can only pass String datatype as arguments, you can’t pass anyothers.  
5: Why string type only: Since basically, you want to replace the exception description with your custom message, message takes String Datatype not int, float..or others. So we use only String Datatype.  
6: You can write custom exception in a class type and call them in different classes.  
7: important exception methods are   
- e.printstacktrace – to print all exception message  
- e.getmessage – to print only exception description  
- e.String – to print position and position description. 

**9: Purpose/Example of custom exceptions**      
For ex: In banking application, customer should always maintain $500  minimum balance. For ex: while doing internal transaction you want to check if a/c minimum balance after transaction is done. If not, throw a exception. So,  you need to write a custom exception for it and throw a message “a/c should have minimum $500 and can’t process this transaction”.

******************************************************************************					
**2:  Throw & Throws**
