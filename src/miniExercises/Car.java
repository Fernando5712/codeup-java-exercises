package miniExercises;

public class Car extends vehicle {
    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public Car(){}


    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirbag(){
        System.out.println("Deploying Airbags");
    }

    @Override
    public String toString() {
        return super.toString() + "\n Miles per Gallon: " + milesPerGallon;
    }

    public void turnOn(){
        System.out.println("Engine turning on ");
    }



}
