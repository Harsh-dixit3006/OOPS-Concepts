package Abstraction;

abstract class _5_Vehicle {
    int wheels;
    String color;

    public _5_Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public abstract void drive();  // abstract method

}
