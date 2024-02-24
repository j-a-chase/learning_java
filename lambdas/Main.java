// Name: James A. Chase
// File: Main.java
// Date: 24 February 2024

/*
 * Lambda Expressions
 * 
 *  - Short blocks of code which take in parameters and return a value
 *  - Similar to methods, but don't need a name and can be implemented right in
 *      the body of a method
 *  - typically in the form of:
 *      parameter -> expression
 *      (parameter1, parameter2) -> expression
 *  - expressions are limited:
 *      - must immediately return a value
 *      - cannot contain variables
 *      - cannot contain assignments or statements
 *  - a code block can be used with curly braces if more than a simple 
 *      expression is required!
 *      (parameter1, parameter2) -> { code block }
 *  - they are typically used as parameters passed to a function!
 *  - can be stored in variables if the variable's type is an interface which 
 *      has only one method
 *  - to use a lambda expression in a method, the method should have a parameter
 *      with a single-method interface as its type
*/

import java.util.ArrayList;

interface MyStringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach( n -> { System.out.println(n); });

        MyStringFunction exclaim = s -> s + "!";
        MyStringFunction ask = s -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, MyStringFunction format) {
        System.out.println(format.run(str));
    }
}
