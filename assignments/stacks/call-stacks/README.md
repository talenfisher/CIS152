# Instructions
Your program uses call stack for methods.

For instance, if your program has a main method (all java programs have 
one!) and its call a computeArea method, then the call stack will have 
main first pushed, then computeArea. When your program returns from 
computeArea, that call information is popped off the call stack. The 
remaining method call (in this case, main) tells the program where to 
return. You can think of calling top() or peek() to get the top element 
of the stack without popping it off the stack.

Another example, if your program contains a main method that calls 
computeBalance which in turn calls computeInterest, the stack would have 
main, computeBalance, computeInterest. Each would be popped off in turn 
when the method completes and returns.

Write a small program with 4 methods named method1, method2, method3 and 
method4. These methods only need to have print statements saying "In 
method1" and "Exiting method1". In main, start with a print statement 
"In main method" then call the various methods in various orders. End 
your main method with "Exiting main" print statement. Submit your 
callStackLastName.java and callStackDriverLastName.java with comments 
about what you saw.
