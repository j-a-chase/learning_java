// Name: James A. Chase
// File: HashMapExample.java
// Date: 23 February 2024

/*
 * HashMaps
 * 
 *  - Store items in key/value pairs
 *  - Keys and values are stored as objects (same primitive typing rules apply)
*/

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // add key/value pairs
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // access value from key
        System.out.println(capitalCities.get("USA"));

        // remove item by key
        capitalCities.remove("England");

        // get size
        System.out.println(capitalCities.size());

        // clear HashMap
        capitalCities.clear();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        // loop through items using for-each
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // if we want both
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
