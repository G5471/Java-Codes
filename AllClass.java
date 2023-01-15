/*what is java?
Ans:- java is a high level perogramming langunage and object orientedprogramming language, it is deveploped by Gemens Goshli in 1995. java first
name is okk.*/
/*how many java feature name and explain?
thre are 12 to 14 java feature (1) simple: simple means java learns simply so java is a simple . And java follow all the syntax of c and c++.
(2)object-oriented: java everything represented as class and object that why java is object-oriented.
(3)Robust:java is a strong language as it uses memory management. the concept like automatic garbag and collection etc make it so.
(4)Platform independent: java platform independent because the byecode of a class run in any os(window , linux , Mac) eyc.
(5)Secured: java is secured because it does not use exclipt ponter. And java also provide the concept of byte code and exception handling.
(6)Protable: java  is protable because it facilitates youu to carry java bytecode to any platfoem.
(7)Inderpeter: java use the just-in-time(jit) interpeter along with the compiler for the program execution.
(8) High-performance: java is fatser then other tradditional interpreted programing language beacuse java bytecode does not to native code.
(9)Multhi-threading: Java sun microsystem provide  API (predefine classes and interface ) to develope multi- thread application so .
(10)Dynamic: inn java  classloder load the classes dynamically to runtime on  demand .
(11)Distributed: Sun microsystem provide the serveal distributed technology in java  so.
*/



/* What is typecasting in java?
typecasting is a process to converting one data-type value to another data-type value.
thre are two type tpyecasting in java.(1) Widening Typecasting(Exclipt typecasting) (2)Narrowing typecasting(implicit typecasting).
(1) Widening typecasting: Lower data-type  converting into heigher data-type . its know as Widening.
(2)Narrowing type-casting:heigher data-type converting into lower data-type. its know as Narrowing.
 */



/* What is Heap and stack memory in java 
(1) Heap Memory: it is created when the jvm start up and used by  the application as the application run. its is store object and jre classes.
    its is dynamically handle the memory block.
(2)Stack Memory: Its is created when thread is  creates. its is stores the variable and particular result.
*/


/*Define JVM , JRE and Jdk ?
(1) JVM(java virtual machine): java stand for java virtual machine. jvm provide the runtime enviroment in which java bytecode executed.
    its read bytecode convert into binary code line by line and executed.
    jvm perform operation:(1)load code (2) verify code (3) executed code (4) provide rintime enviroment
(2) JRE(java runtime enviroment): java rumtime enviroment is a part of jdk. it is used to provide the rumtime enviromrnt Which are used for
    developing java application..
(3)JDK(java developpment kits): java developement kist is a software develope enviroment . which  is used to develope java application and applits
 */


/* What is classloder ?
Classloader is special java classes which are developeed by sun micro system And classloder load the class from some location into jvm memory. 
 */


/* what is (JNT) JAVA NATIVE INTERFACE ?
java native interface is a farmwork which provide an interface to communiction with another application. written in another language like c , c++.
 */


/* What is variable And type of variable ?
Variable: A variable is a container which hold the value while the java program executed. A variable is assigned with a data-type.
Thre are 3 type of variable(1) Local variable(2) Instance Variable (3) Static Variable
(1) Local Variable: Local variable declared inside the body of the method is called Local variable.
(2)Instance Variable: A variable declared inside the class but outside the body of the method  is called Instance variable.
(3)Static variable: A variable is declared inside the class by using static keyword is called static variable.
 */


/*What is satic keyword?
The static keyword is a non-access modifiers used for method and Attributes. Static method can be accessed withod creating  and object of a class.
 */



// Oops in java.........................
/* What is oops and type Expalain All?
OOps ( object oriented programming langunage ):object-oriented programming language is a paradim that provide many concept.
There are 6 type (1) Class (2) Object (3) Inheritance (4) Polymorphism (5) Encapsulation (6) Abstraction
(1)Class: A class is group of object. it is logical entity. We created any class no take space in memory.
(2)Object:A object is instance of class that executed the class. We created any object take some space in memory.
Class Demo{   // Class................
        int a=10;
        String str="Anshu";
        void show(){
            System.out.println(a+" "+b);
        }
    }
    Class test{
        public static void main(String[]args){
            Demo r=new Demo();  // Object..................
            r.show();
        }
}


What is Constructor? 
A construction in special java method  where name is same class name.
==> The main purpose fo constructor is initilized the object.
==>A  constructor is automaatically called at time of object creation
Example:=======>>>>
Class A{
    int id;
    String name;
    A(){             // Default Constructor......
        a=10;
        name="Anshu";
    }
    void disp(){
        System.out.println(a+" "+name);
    }
}
Class B{
    public static void main(String[]args){
        A ref=new A();
        ref.disp();
    }
}


what is Default Constructor ?
A constructor wich does not have any parameter is called default constructor.



What is parameterized constructor in  java?
A constructor through which we can pass one or more parameter is called parameterized

Example:
    Class A{
        int x; 
        String name;
        A(int a , String b){
            x=a;
            name=b;
        }
        void show(){
            System.out.println(x+" "+name);
        }
    }
    class B{
        public static void main(String []args){
            A ref=new A(100,"Guddu");
            ref.show();
        }
    }



What is static keyword?
The static keyword is a non-access modifier used for method and attributes.
Static mathod can be accessed withoud creating an object of a class.

What is Static block? 
A block which is declared using static keyword is called as static block.
Static block is executed only once at time of classsloding or load a class.
Example:
    Class A{
        static{
            System.out.println("hyy");
            public static void main(String[]args){
                System.out.println("hello main");
            }
        }
    }

What is Static method?
if you apply static keyword with any method . it is called static method.

What is Instance Block ?
Instance block similar to the method which has np name , it can be written inside a class only but not outside the method.


What is Inheritance?
Inheritance the properties of one class to another is called inheritance.
    Extends keyword is used to perform inheritance.

Example:
class emp{
    float salary=4000.0;
}
class programmer extends Emp{
    int bonus=10000;
    public static void main(){
        programmer p=new programmer();
        System.out.println(p.salary);
        System.out.println(p.salary);
    }
}


There are 5 type of Inheritance...
(1)Single inheritance (2)Multiple inheritance (3)Multi-level inheritance (4) Hierarchical inheritance (5) Hybrid inheritance
(1) Single inheritance: When a class inherit another class it is know single inheritance.
Example:
    class Animal{
        void eat(){
            System.out.println("eating...");
        }
    }
    class dog extends Animal{
        void bark(){
            System.outt.println("barking...");
        }
    }
    class test{
        public static void main(String[]args){
            dog d=new dog();
            d.eat();
            d.bark();
        }
    }


(2)Multiple inheritance:
Multiple inheritance not support in java becaues its lead diamond problem.

(3)Multi-level inheritance:
We have only one super-class and we created multiple sub-class is called Multi-level inheritance.

Example:
    class Animal{
        void eat(){
            System.out.println("eating...");
        }
    }
    class dog extends Anumal{
        void bark(){
            System.out.println("barking.......");
        }
    }
    class baby extend dog{
        void weep(){
            System.out.println("weeping...");
        }
    }
    class test{
        public static void main(String[]args){
            dog d=new dog();
            d.eat();
            d.bark();
            d.weep();
        }
    }
 */

