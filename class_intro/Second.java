public class Second {
    int x;

    // if we don't want to let an attribute be changed, we make it final
    final int y = 7;

    // here we add our constructor for our Second class
    public Second() {
        x = 5;
    }

    // here we add a method to be used
    public void addAttributes() {
        System.out.println(x + y);
    }
}
