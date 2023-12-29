Oops- Stands for Object Oriented programing language.
Object- real world entity and on other word instance of class .
Class - Its blue print of object without class we cant create a programing
methods- method is nothing but set of rule used to perform specific task
variable- its a place holder which hold the value and occupy the memory

priciples:
Abstaction- hiding the implementation showing only the feature
Inheritance- accquring the property of base class into derived class.
Polymorphism- many form
compile time poly- same method and dif parameter
run time poly- same method and same parameter
Encapsulation- hiding the date or wrapping the date in single unit.

Exception - abnormal termination of program
Exp handling- Identifing the exception and doing the opropriate code to handle the exception.

lang
Object
throwable
Exception and Error


checked exception  and un checked exception

unused index
multiple join
constructor
destructor
serilizable - the object storeded in 

[14:53] Veera Babu
    Arithmetic
​[14:53] Veera Babu
    NumberFormat
​[14:53] Veera Babu
    Nullpointer
    ArrayIndex
    Custom Exception

lang--Object
util
io
rmi
net
sql
....
 
Collections
 
Set// Unique collection of unordered elements--No order,No dupl
Hashset
Treeset
 
List// Ordered collection of elements---dupl,insertion order
Arraylist
Linkedlist
 
Map// stores elements in key,val--pair
Entry
Hashmap
Treemap
 
Iterator//
 
Vector
Hashtable
Properties
Stack
Queue
Date
Random
Scanner
 
Enumeration


Multi threading- concurrent execution of the program.

thread- thread is a light weight process and execute the multiple code in parellelly.

why we require thread?- allow program to perform efficient and doing multiple things in same time

how many ways create thread - 2 ways one extending thread class and implementing runnable interface.

life cycle of thread
    new- when thread instance is created that is new state
    runnable- when thread is started that is runnable state
    running- when thread is running that is running state
    waiting- when thread is put on hold or its wating for other thread to complete then that is called waiting state.
    terminated- when thread is dead that is terminated state.
    blocked-wont perform any operation.

 methods
    -start-> start the thread
    -getstate- get the current status of the thread
    -getName()- get the name of the thread
    -getPriority()- Its returns the priority of the thread
    -sleep()- stop the thread for the specific time
    -join()-stop the current thread util called thread gets terminated
    -isAlive()- check if the thread is alive
    -run()- to run the thread meaning, execution start from here.
    -currentThread()
    -yield()-pause the current thread and allow other thread to execute temporarly
    -stop()- stop the thread

 thread priority
    -NORM_PRIORITY - 5
    -MIN_PRIORITY -1
    -MAX_PRIORITY -10

 how set name for thread
    -setName() - setting the thread name
    -getName() - Thread.currentThread().getName()

sysnchronization- allow only one thread to access the shared resources.

inter communication
process communication


