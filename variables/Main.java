// Name: James A. Chase
// File: Main.java
// Date: 14 February 2024

public class Main {
    public static void main(String[] args) {
        String name = "James";
        int num = 42;

        // to create a constant in Java, we use the 'final' keyword
        final int newNum = 84;
        float myFloat = 5.5f;
        boolean bool = true;

        System.out.println(name);
        System.out.println(num);
        System.out.println(newNum);
        System.out.println(myFloat);
        System.out.println(bool);
        
        // we can also concatenate in our println function!
        System.out.println("Hello " + name);

        // if we want to assign multiple values of the same type, we can do so using a comma-separated list
        int x = 3, y = 4, z = 5;
        System.out.println(x + y + z);

        // we can also assign one value to multiple variables at once
        int a, b, c;
        a = b = c = 5;
        System.out.println(a + b + c);
    }
}
