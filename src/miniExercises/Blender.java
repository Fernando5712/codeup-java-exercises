package miniExercises;

public class Blender extends Appliance{
    @Override
    public void doWork() {
        System.out.println("This one works too!");
    }

    @Override
    public void makeSound() {
        System.out.println("ok its louder than the last one");
    }
}
