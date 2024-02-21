public class Second {
    int x, z;

    // if we don't want to let an attribute be changed, we make it final
    final int y = 7;

    // here we add our constructor for our Second class
    public Second() {
        x = 5;
        z = 0;
    }

    // we can overload the constructor to assign z a value when the user
    // provides a parameter for the constructor
    public Second(int num) {
        x = 5;
        z = num;
    }

    // here we add a method to be used
    public void addAttributes() {
        System.out.println(x + y);
    }
}
