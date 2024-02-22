class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("HONK!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }
}
