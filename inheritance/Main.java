// Name: James A. Chase
// File: Main.java
// Date: 22 February 2024

/*
 * Inheritance
 *  - Done using the 'extends' keyword
 *  - One class is the 'superclass', while the other is the 'subclass'
 *  - The 'final' keyword can be used to prevent inheritance of a class
*/

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.getModelName());
    }
}
