package Abstraction;

class _7_Test {
    public static void main(String[] args) {
        _5_Vehicle myCar = new _6_car(4, "Red");  // ✅ Abstract reference, concrete object
        myCar.drive();  // Output: Driving car with 4 wheels and color Red
    }

}
