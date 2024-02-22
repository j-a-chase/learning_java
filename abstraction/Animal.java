// Data abstraction is the process of hidiing certain details and showing only
// essential information to the user.
// Abstraction can be achieved either with abstract classes or interfaces

/*
 * Abstraction
 *  - uses the 'abstract' keyword for classes and methods
 *  - Abstract class:
 *      - restricted class that cannot be used to create objects (must be
 *          inherited from another class to access it)
 *  - Abstract method:
 *      - can only be used in an abstract class, does not have a body;
 *          body is provided by the subclass.
 *  - abstract classes can have both abstract and regular methods!
*/

// This class cannot be made an object, will generate error!
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oink oink");
    }
}
