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
}
