// Name: James A. Chase
// File: Second.java
// Date: 21 February 2024

abstract class Second {
    public String fname = "James";
    public int age = 21;
    public abstract void study(); // abstract method
}

class Student extends Second {
    public int gradYear = 2025;

    // body of the abstract method provided here!
    public void study() {
        System.out.println("This is the abstract method overridden!");
    }
}
