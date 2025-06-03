package Polymorphism;

import java.security.Provider;

public class _2_Car extends _1_Vehicle {

    @Override
    public void Service() {
        System.out.println("Car is getting Serviced");
    }
}
// Here we have seen use of Override in which we studied that override is the condition
// in which the work of function of parent class is being override by its child class.
