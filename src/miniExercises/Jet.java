package miniExercises;

public class Jet extends vehicle {
    private int maximumAltitude;

    public void takeOff(){
        System.out.println("Taking Off...");
    }

    public Jet(){}

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public Jet(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public String toString(){
        return super.toString() + "\nMaximum Altitude: " + maximumAltitude;
    }

    public void turnOn(){
        System.out.println("Engines firing up");
    }
}
