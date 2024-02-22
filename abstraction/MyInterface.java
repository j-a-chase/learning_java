/*
 * Interfaces:
 * 
 *  - another method of abstraction
 *  - an 'interface' is a completely abstract class that is used to group related methods with empty bodies
 *  - must be 'implemented' by another class with the 'implements' keyword to access the interface methods
 *  - cannot be used to create objects
 *  - no method bodies
 *  - an implemented interface MUST override all the methods
 *  - methods by default are 'abstract' and 'public'
 *  - attributes by default are 'public', 'static', and 'final'
 *  - cannot contain a constructor (as it can't be used to make objects)
 *  - Java doesn't support 'multiple inheritance', but you can implement multiple INTERFACES
 */
interface MyInterface {
    public void run();
    public void fight();
}

interface MyOtherInterface {
    public void hide();
}

class Soldier implements MyInterface, MyOtherInterface {
    public void run() {
        System.out.println("I'm running away!");
    }

    public void fight() {
        System.out.println("I'm standing to fight!");
    }

    public void hide() {
        System.out.println("I'm hiding from the enemy!");
    }
}
