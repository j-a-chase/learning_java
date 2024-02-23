// Name: James A. Chase
// File: Main.java
// Date: 23 February 2024

// Java doesn't have a built-in Date class, but the java.time package works with
// the date and time API.
// Ex:
//      - LocalDate: represents a date (year, month, day (yyyy-MM-dd))
//      - LocalTime: represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//      - LocalDateTime: represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//      - DateTimeFormatter: Formatter for displaying and parsing date-time objects

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // displaying current date example
        LocalDate myLocalDate = LocalDate.now(); // creates a date object
        System.out.println(myLocalDate);

        // displaying current time example
        LocalTime myLocalTime = LocalTime.now(); // creates a time object
        System.out.println(myLocalTime);

        // current date and time example
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println(myLocalDateTime);

        // datetime formatter example
        System.out.println("Before formatting: " + myLocalDateTime);
        
        /*
         * The .ofPattern method accepts all sorts of values for different datetime formats
         *  Ex:
         *      - yyyy-MM-dd -> '2024-02-23'
         *      - dd/MM/yyyy -> '23/02/2024'
         *      - dd-MMM-yyyy -> '23-Feb-2024'
         *      - E, MMM dd yyyy -> 'Fri, Feb 23 2024'
         */
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

        String formattedDate = myLocalDateTime.format(myFormatter);
        System.out.println("After formatting: " + formattedDate);
    }
}
