public class Main {

    // Here we create an instance of the Second object and print the value of its attribute, x
    public static void main(String[] args) {
        Second obj = new Second();
        System.out.println(obj.x);

        // we can change attributes like this
        obj.x = 40;
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.addAttributes();

        System.out.println(obj.z);

        Second obj2 = new Second(42);
        System.out.println(obj2.z);
    }

    // To run this, if we compile Second first, we then have to compile Main and run
    // If we compile Main first, then it will compile all of Main's dependencies as well!
}
