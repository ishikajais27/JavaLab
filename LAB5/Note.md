Course Contents: – Abstract class in Java
– Interface in Java

- Package in Java

1. Aim of the program -Illustrate the usage of abstract class with following Java classes –
    An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
   method course()
   A subclass ‘kiitian’ with course() method implementation
   Write the driver class to print the all details of a kiitian object.

Input - Rollno - 2205180

Registration no - 1234567890

Output -Rollno - 2205180

Registration no - 1234567890
Course - B.Tech. (Computer Science &amp; Engg)

2. Aim of the program -Define an interface Motor with a data member –capacity and two methods
   such as run() and consume(). Define a Java class ‘Washing machine’ which implements this
   interface and write the code to check the value of the interface data member thru an object of the
   class.

Input - mentioned in the program
Output - Capacity of the motor is -----

3. Aim of the program -Define an interface with three methods – earnings(), deductions() and bonus()
   and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
   Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
   bonus() method. Write the complete program to find out earnings, deduction and bonus of a
   substaff with basic salary amount entered by the user as per the following guidelines –
   earnings basic + DA (80% of basic) + HRA (15% of basic)
   deduction PF 12% of basic
   bonus 50% of basic
   Input -Basic salary - 50000
   Output -Earnings - 97500
   Deduction -6000
   Bonus - 25000

4. Aim of the program - Define an interface Emploee with a method getDetails() to get emplyee
   details as Empid and Ename. Also define a derived interface Manager with a method
   getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head
   which implements Manager interface and also prints all details of the employee. Write the complete
   program to display all details of one head of the department.
   Input - Enter employee id - 123
   Enter employee name - Sidharth Ambani
   Enter department id - 06
   Enter department name -Marketing
   Output - Employee id - 123
   Employee name - Sidharth Ambani
   Department id - 06
   Department name -Marketing

5. Aim of the program - Define two packages as – General and Marketing. In General package
   define a class ‘employee’ with data members as empid(protected), ename(private) and a public
   method as earnings() which calculate total earnings as
   earnings basic + DA (80% of basic) + HRA (15% of basic)
   In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a
   method tallowance() which calculates Travelling Allowance as 5% of total earning. Write the
   programs to find out total earning of a sales person for the given basic salary amount and print
   along with the emp id.

Input: Enter the employee id and emploee name 123 Amit

Enter the basic salary 1000
Output: The emp id of the employee is 123
The total earning is 1950.0
