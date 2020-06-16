package miniExercises;

public class vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public vehicle (boolean isOperable, int passengerCapacity, String powerSource) {
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }
    public void turnOn(){
        System.out.println("Vehicle is turning on");
    }

    public vehicle(){}

//    @Override
//    public String toString() {
//        return "vehicle{" +
//                "isOperable=" + isOperable +
//                ", passengerCapacity=" + passengerCapacity +
//                ", powerSource='" + powerSource + '\'' +
//                '}';
//    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String toString() {
        return "Vehicle " + "is Operable: " + isOperable + "\n Capacity : " + passengerCapacity + "\n Power Source: " +
                powerSource;
    }
}