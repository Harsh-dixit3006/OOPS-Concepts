package Abstraction;

class _6_car extends _5_Vehicle{
    public _6_car(int wheels, String color) {
        super(wheels, color);
    }

    public void drive() {
        System.out.println("Driving car with " + wheels + " wheels and color " + color);
    }

}
