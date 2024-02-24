// Name: James A. Chase
// File: Main.java
// Date: 24 February 2024

/*
 * Java Threads
 * 
 *  - allows a program to operate more efficiently by doing mutiple things at 
 *      the same time
 * 
 *  - can be used to perform complicated tasks in the background without 
 *      interrupting the main program
 * 
 * Creating Threads:
 *      - Can be created by extending the Thread class and overriding its run()
 *          method
 * 
 *      - Can be created by implementing the 'Runnable' interface
 * 
 * Running Threads:
 *      - If the class extends the 'Thread' class, the thread can be run by 
 *          creating an instance of the class and calling its start() method
 * 
 *      - If the class implements the 'Runnable' interface, the thread can be 
 *          run by passing an instance of the class to a Thread object's 
 *          constructor and then calling the thread's start() method
*/

// Here we will implement because it's better to do that so that inheritance is
// not prevented!
public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread.");
    }

    public void run() {
        System.out.println("This code is running in a thread.");
    }
}
