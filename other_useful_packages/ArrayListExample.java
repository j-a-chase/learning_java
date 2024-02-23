// Name: James A. Chase
// File: ArrayListExample.java
// Date: 23 February 2024

/*
 * The ArrayList is a resizable array, which can be found in the java.util
 * package.
 * The difference between a built-in array and an ArrayList in Java, is 
 * that the size of an array cannot be modified (if you want to add or 
 * remove elements to/from an array, you have to create a new one).
 * Elements can be added and removed from an ArrayList whenever you want.
 * 
 * Note: Elements in an ArrayList are all objects, this means when we want
 * to use a primitive type in an ArrayList, we have to use an equivalent wrapper
 * class for it.
*/

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // we initialize the ArrayList like so:
        ArrayList<String> cars = new ArrayList<String>();

        // items are added using the add method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // to access indices in an ArrayList, we use the get method
        System.out.println(cars.get(0));

        // to change an item, we use the set method
        cars.set(0, "Opel");
        System.out.println(cars);

        // to remove an element, we use the remove method with the index number
        cars.remove(0);
        System.out.println(cars);

        // to remove all the elements, we use the clear method
        cars.clear();
        System.out.println(cars);

        // to find out how many elements are in the ArrayList, we use the size
        // method
        System.out.println(cars.size());

        // we can also loop through an ArrayList with a for loop, using the size
        // method to specify how long it should run
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // we can also use the for-each loop to accomplish the same task
        for (String str : cars) {
            System.out.println(str);
        }


    }
}
