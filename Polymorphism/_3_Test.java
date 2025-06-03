package Polymorphism;

public class _3_Test {
    public static void main(String[] args) {
        _1_Vehicle veh = new _1_Vehicle();
        _2_Car car = new _2_Car();

        veh.Service();
        car.Service();
    }
}
