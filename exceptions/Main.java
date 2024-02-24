// Name: James A. Chase
// File: Main.java
// Date: 24 February 2024

import java.util.Scanner;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]); // error!!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This runs anyways regardless of an error!");
        }

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = inp.nextInt();
        inp.close();

        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
