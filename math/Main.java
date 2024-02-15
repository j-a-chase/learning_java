// Name: James A. Chase
// File: Main.java
// Date: 15 February 2024

public class Main {
    public static void main(String[] args) {
        byte a = 5, b = 10;

        System.out.println("a: " + a + " <-> " + "b: " + b);
        System.out.println("max(a, b): " + Math.max(a, b));
        System.out.println("min(a, b): " + Math.min(a, b));

        byte c = 9;
        System.out.println("c: " + c + " sqrt(c): " + Math.sqrt(c));

        byte d = -4;
        System.out.println("d: " + d + " abs(d): " + Math.abs(d));

        System.out.println("Random Number: " + Math.random());

        System.out.println("Random Number 1-10: " + ((int)(Math.random() * 10) + 1));

        // https://www.w3schools.com/java/java_ref_math.asp
    }
}