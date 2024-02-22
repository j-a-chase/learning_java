class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oink oink.");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bark bark.");
    }
}
