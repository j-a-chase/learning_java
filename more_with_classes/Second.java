// Name: James A. Chase
// File: Second.java
// Date: 21 February 2024

abstract class Second {
    public String fname = "James";
    public int age = 21;
    public abstract void study(); // abstract method
}

class Student extends Second {
    // Encapsulation: ensuring 'sensitive' data is hidden from users
    // To do this, we make class attributes private and use public getters and setters as we need them!
    private int gradYear = 2025;

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int year) {
        this.gradYear = year;
    }

    // body of the abstract method provided here!
    public void study() {
        System.out.println("This is the abstract method overridden!");
    }
}
