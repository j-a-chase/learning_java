// Name: James A. Chase
// File: Main.java
// Date: 15 February 2024

public class Main {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word.length());
        System.out.println(word.toUpperCase() + " " + word.toLowerCase());
        System.out.println(word.indexOf('e'));
        System.out.println(word.indexOf("ll"));
        
        // https://www.w3schools.com/java/java_ref_string.asp

        String otherWord = "World";
        System.out.println(word + " " + otherWord);
        System.out.println(word.concat(" ").concat(otherWord));

        int num = 20;
        String strNum = "10";
        System.out.println(strNum + num);
    }
}
