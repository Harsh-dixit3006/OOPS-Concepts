package Abstraction;

public abstract class _2_Father implements _1_Grandfather{

    private int noOfWheel;
    private String Colour;

    public _2_Father(int noOfWheel, String colour) {
        this.noOfWheel = noOfWheel;
        this.Colour = colour;
    }
    public abstract void mandatory();

    public void height(){
        System.out.println("60.5inches");
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public void commute(){
        System.out.println("going..");
    }


}
