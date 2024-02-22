// The purpose of nesting classes is to gropu classes that belong together,
// which helps with code readability and maintainability.
class OuterClass {
    int x = 10;

    // unlike 'regular' classes, an inner class can be 'private' or 'protected'
    // if we don't want outside objects accessing the inner class, we declare
    // the inner class as private!
    private class InnerClass {
        int y = 5;
    }

    public int getY() {
        InnerClass temp = new InnerClass();
        return temp.y;
    }

    // we can also create static inner classes which don't require an object of the outer class to be created!
    // HOWEVER! a static inner class does not have access to members of the outer class
    static class StaticClass {
        int z = 25;
    }
}
