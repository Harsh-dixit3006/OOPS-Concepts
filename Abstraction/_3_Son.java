package Abstraction;

class _3_Son extends _2_Father {

    public _3_Son(int noOfWheel, String colour) {
        super(4,"Blue");
    }

    @Override
    public void mandatory() {
        System.out.println("Yes done");
    }
}
