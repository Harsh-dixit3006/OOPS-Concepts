package Polymorphism;

public class Calculator {


    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

//    public Calculator() {
//    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(24,25,26,27));
        System.out.println(calc.add(24,26));
    }
}
// here concept of overloading is being used in which we se how same method name is being used
// with different Signature(either different no. of parameters , different type of parameters etc.)

