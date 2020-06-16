package miniExercises;

import java.util.ArrayList;
import java.util.List;

public class vehicleTest {
    public static void main(String[] args) {
        vehicle a = new vehicle();
        Car b = new Car();
        Jet c = new Jet();

        a.setOperable(true);
        a.setPassengerCapacity(4);
        a.setPowerSource("Fossil Fuels");

        b.setOperable(false);
        b.setPassengerCapacity(4);
        b.setPowerSource("Electric");
        b.setMilesPerGallon(17);

        c.setOperable(true);
        c.setPassengerCapacity(45);
        c.setPowerSource("Jet Fuel");
        c.setMaximumAltitude(7000);

        vehicle[] vehicles = new vehicle[2];
        vehicles[0] = b;
        vehicles[1] = c;



        System.out.println(a.toString());
        System.out.println("================");
        System.out.println(b.toString());
//        b.turnOn();
        b.deployAirbag();
        System.out.println("=================");
        System.out.println(c.toString());
//        c.turnOn();
        c.takeOff();
        System.out.println("==================");
        turnVehiclesOn(vehicles);
//        System.out.println(b.toString());
//        System.out.println("====================");
//        System.out.println(c.toString());
    }

    public static void turnVehiclesOn(vehicle[] vehicles){
        for (vehicle a: vehicles){
            a.turnOn();
        }
    }
}
