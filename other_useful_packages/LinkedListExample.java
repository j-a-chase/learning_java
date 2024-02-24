// Name: James A. Chase
// File: LinkedListExample.java
// Date: 23 February 2024

/*
 * The LinkedList is almost identical to the ArrayList
 * Has all of the same methods, because both implement the List interface
 * Despite all of this, they are built very differently!
 * 
 * ArrayList:
 *      - Has a regular array inside it
 *      - When an element is added, it is placed inot the array. If the array
 *          is not big enough, a new larger array is create to replace the old
 *          one and the old one is removed.
 *      - Better for storing and accessing data
 * LinkedList:
 *      - Stores items in containers
 *      - Has a link to the first container, and each container has a link to
 *          the next container in the list. To add an element, the element is
 *          placed into a new container and that container is linked to one of
 *          the other containers in the list
 *      - Better for manipulating data
 * 
 * The ArrayList tends to be more efficient in many cases, but the LinkedList
 * provides some methods to do certain operations more efficiently:
 *      - addFirst()
 *      - addLast()
 *      - removeFirst()
 *      - removeLast()
 *      - getFirst()
 *      - getLast()
*/

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("Linked List notes!");
    }
}
