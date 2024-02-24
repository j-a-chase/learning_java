// Name: James A. Chase
// File: HashSetExample.java
// Date: 23 February 2024

/*
 * A HashSet is a collection of items where every item is unique
*/

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // create a new HashSet
        HashSet<Integer> primes = new HashSet<Integer>();

        // add items
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(7);
        System.out.println(primes);

        // check if set contains an item
        System.out.println(primes.contains(13));

        // remove an item
        primes.remove(7);

        // get size of set
        System.out.println(primes.size());

        // empty the set
        primes.clear();

        // we can loop through sets
        for (Integer i : primes) {
            System.out.println(i);
        }
    }
}
