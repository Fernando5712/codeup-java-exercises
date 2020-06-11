package util;

public class InputTest {
    public static void main(String[] args){

        Input in = new Input();
        System.out.println("Please add a word");
        String userString = in.getString();
        System.out.println(userString);

        System.out.print("Do you want to go on.");
        boolean tF = in.yesNo();
        System.out.println(tF);

        System.out.println("Enter a number ");
        int userInt = in.getInt();
        System.out.println("You entered " + userInt);
    }
}
