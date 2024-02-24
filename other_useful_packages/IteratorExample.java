/*
 * Iterator
 * 
 *  - an object that can be used to loop through collections
 *  - can be a more straightforward way to loop through a whole collection and
 *      perform actions based on a condition
 *  - this is helpful when removing items from a collection as a for loop won't
 *      work since the size is changing
*/

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // example collection
        HashSet<Integer> primes = new HashSet<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);

        // get iterator
        Iterator<Integer> it = primes.iterator();

        // print items
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
