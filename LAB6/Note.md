Course Contents: - Exception handling in Java

- User defined exception in Java

List of Programs :

1. Aim of the program - Write a Java program to generate an
   ArrayIndexOutofBoundsException and handle it using catch statement.
   Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
   Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4
2. Aim of the program- Write a Java program to handle an ArithmeticException using try,
   catch, and finally block.
   Input: Operand values for division operation mentioned in the program
   Output: ArithmeticException caught by try-catch-finally block
3. Aim of the program- Write a Java class which has a method called ProcessInput(). This
   method checks the number entered by the user. If the entered number is negative then
   throw an user defined exception called NegativeNumberException, otherwise it displays
   the double value of the entered number.
   Input: Enter a number 4
   Output: Double value: 8
   Input: Enter a number -4
   Output: Caught the exception
   Exception occurred: NegativeNumberException: number should be
   positive

4. Aim of the Program: Write a program to create user defined exceptions called
   HrsException, MinException and SecException. Create a class Time which contains data
   members hours, minutes, seconds and a method to take a time from user which throws
   the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).
   Input: Enter hours: 4
   Enter minutes: 54
   Enter seconds: 34
   Output: Correct Time-&gt; 4:54:34
   Input: Enter hours: 30
   Enter minutes: 65
   Enter seconds: 65
   Output: Caught the exception
   Exception occurred: InvalidHourException:hour is not greater than 24
   Exception occurred: InvalidMinuteException:hour is not greater than 60
   Exception occurred: InvalidSecondException:hour is not greater than 60
5. Aim of the Program: Create an user defined exception named CheckArgument to check
   the number of arguments passed through command line. If the number of arguments is
   less than four then throw the Check Argument exception, else print the addition of squares
   of all the four elements.
   Input: 4 3 2 1
   Output : 30
   Input: 4 3 2
   Output : Exception occurred - CheckArgument
