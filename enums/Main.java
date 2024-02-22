// Name: James A. Chase
// File: Main.java
// Date: 22 February 2024

/*
 * Enums:
 * 
 *  - special 'class' that represents a group of 'constants'
 *  - created using the 'enum' keyword, separating the constants with a comma
 *  - constants should be uppercase
 *  - can be inside a class
 *  - often used in switch statements to check for corresponding values
 * 
 * Difference between Enums and Classes:
 * 
 *  - an enum can have attributes and methods, but enum constants are public, static, and final
 *  - an enum cannot be used to create objects, and cannot extend other classes (it can implement interfaces)
 *  - useful when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
*/

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        // here we use the enum in a switch statement!
        switch(myVar) {
            case LOW:
                System.out.println("Low level.");
                break;
            case MEDIUM:
                System.out.println("Medium level.");
                break;
            case HIGH:
                System.out.println("High level.");
                break;
        }

        // we can also loop through enums using the 'values' method!
        for (Level lvl : Level.values()) {
            System.out.println(lvl);
        }
    }
}
