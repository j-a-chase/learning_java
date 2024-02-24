// Name: James A. Chase
// File: Main.java
// Date: 24 February 2024

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]); // error!!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This runs anyways regardless of an error!");
        }
    }
}
