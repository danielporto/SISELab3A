# SISELab3A
Lab3 worksheet Exercise A - Thread safe variables


Change the class Counter. First, remove the synchronized keyword used to run 
the critical section in mutual exclusion. 
Run your program a few times to verify that the out start changing again.

Now, instead of the synchronized methods or the synchronized block we learn in Lab2, 
let’s use an AtomicInteger to replace the regular “int” to fix the critical section. 
To do that, change the type of the variable “cnt” to AtomicInteger. Then, change 
the initialization of the variable inside the constructor of the Counter.  Next, 
change the methods used access the “cnt” value to calls to thread-safe methods 
of the AtomicInteger. For more information check the Java API  list of methods 
and a description on how they work. 


Don’t forget to compile and execute the program several times to verify that the 
implementation is behaving as expected.
