// Name: James A. Chase
// File: Main.java
// Date: 22 February 2024

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        // Interfaces example
        Soldier obj = new Soldier();
        obj.run();
        obj.hide();
        obj.fight();
    }
}
