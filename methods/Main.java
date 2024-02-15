// Name: James A. Chase
// File: Main.java
// Date: 15 February 2024

public class Main {
    static void myMethod() {
        System.out.println("Hello method!");
    }

    static void myParameterMethod(String fname) {
        System.out.println("Hello, " + fname + ".");
    }

    static int addTwo(int x) {
        return x + 2;
    }

    static int addNums(int a, int b) {
        return a + b;
    }

    // overloaded method!
    // As long as the number and/or type of parameters are different,
    // a method can have several different overloads
    static double addNums(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Methods
        myMethod();

        myParameterMethod("James");

        System.out.println(addTwo(4));
        System.out.println(addNums(1, 2));
        System.out.println(addNums(.4, 1.65));
    }
}
