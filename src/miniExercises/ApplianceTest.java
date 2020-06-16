package miniExercises;

public class ApplianceTest {
    public static void main(String[] args) {
        Refrigerator myFridge = new  Refrigerator();
        Blender myBlender = new Blender();

        System.out.println("Appliances");
        System.out.println("====================");
        System.out.println("Fridge");
        myFridge.doWork();
        myFridge.makeSound();
        System.out.println("-----------------");
        System.out.println("Blender");
        myBlender.doWork();
        myBlender.makeSound();
    }
}
