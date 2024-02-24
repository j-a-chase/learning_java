public class ObjectWrappersExample {
    public static void main(String[] args) {
        // wrapper objects are used in collections, but can also be used outside
        // of them.
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // there's also the useful toString method which then allows us to use
        // the string 'length' method
        System.out.println(myInt.toString().length());
    }
}
