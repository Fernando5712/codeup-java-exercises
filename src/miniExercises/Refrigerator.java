package miniExercises;

public class Refrigerator extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("Making a lot of noise back there ");
    }

    @Override
    public void doWork() {
        System.out.println("Oh its working ");
    }
}
