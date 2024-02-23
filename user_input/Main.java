// Name: James A. Chase
// File: Main.java
// Date: 22 February 2024

/*
 * The Scanner class is used to get user input, found in the java.util package
 * In the example below, we use the .nextLine() method, but there are several
 * different methods we can use to obtain different types of input!
 * 
 * Methods:
 *  - nextBoolean() -> reads a boolean value from the user
 *  - nextByte() -> reads a byte value from the user
 *  - nextDouble() -> reads a double value from the user
 *  - nextFloat() -> reads a float value from the user
 *  - nextInt() -> reads an int value from the user
 *  - nextLine() -> reads a String value from the user
 *  - nextLong() -> reads a long value from the user
 *  - nextShort() -> reads a short value from the user
 * 
 * Note: if incorrect input is entered, an exception will be thrown.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username: ");
        System.out.print("> ");

        String userName = obj.nextLine();
        obj.close();
        System.out.println("Username is: " + userName);
    }
}
