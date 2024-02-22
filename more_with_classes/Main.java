// Name: James A. Chase
// File: Main.java
// Date: 21 February 2024

/*
 * Access Modifiers:
 * 
 *  For classes:
 *      - public: class is accessible by any other class
 *      - default: only accessible by classes in the same package (used when no modifier is specified)
 * 
 *  For attributes, methods, and constructors:
 *      - public: accessible for all classes
 *      - private: only accessible within the declared class
 *      - default: only accessible in same package
 *      - protected: accessible in same package and subclasses
 * 
 * Non-access Modifiers:
 * 
 * 
 *  For classes:
 *      - final: class cannot be inherited by other classes
 *      - abstract: class cannot be used to create objects
 * 
 *  For attributes and methods:
 *      - final: cannot be overridden/modified
 *      - static: belongs to class, not object
 *      - abstract: only used in an abstract class
 *      - transient: attributes and methods are skipped when serializing the object containing them
 *      - synchronized: methods can only be accessed by one thread at a time
 *      - volatile: value of an attribute is not cached thread-locally, and is always read from the "main memory"
 */

/*
 * Java Packages & API
 * 
 * - Used to avoid name conflicts and write better, maintainable code.
 * 
 *  Built-in Packages:
 *      - The Java API is a library of prewritten classes, free to use, included in the Java DE
 *      - Divided into packages and classes
 *      - to use a class or package from the library, the 'import' keyword is required
 *          - Ex: 'import package.name.Class;' - to import a single class
 *          - Ex: 'import package.name.*;' - to import a whole package
 *  User-defined Packages:
 *      - to create a package, we use the 'package' keyword at the top of our class file
 */

// used to get user input!
import java.util.Scanner;
import mypack.MyPackage;

public class Main {
    final int x = 10;
    final double PI = 3.14;

    static void staticMethod() {
        System.out.println("This method is static!");
    }

    public void publicMethod() {
        System.out.println("This method is public!");
    }

    public static void main(String[] args) {

        staticMethod();
        Main obj = new Main();

        // These lines will throw errors due to them being constants
        // obj.x = 50;
        // obj.PI = 25;

        System.out.println(obj.x);
        obj.publicMethod();

        // Abstract example
        Student stu = new Student();

        System.out.println("Name: " + stu.fname);
        System.out.println("Age: " + stu.age);
        System.out.println("Grad Year: " + stu.getGradYear());
        stu.setGradYear(2020);
        System.out.println("Grad Year: " + stu.getGradYear());
        stu.study();

        // Built-in package example
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter username: ");
        String uName = userInput.nextLine();
        userInput.close();
        System.out.println("Username is: " + uName);

        // User-defined package example
        MyPackage pack = new MyPackage();
        System.out.println(pack.x);
    }
}
