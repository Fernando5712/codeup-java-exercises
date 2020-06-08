import java.util.Scanner;

public class bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("say Hey! to Bob");

        boolean greeting;

        do{
            String input = sc.nextLine();
            greeting = (!input.equals("bye"));

            if (input.endsWith("?")){
                System.out.println("Sure?");
            } else if (input.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")){
                System.out.println("Fine, be that way!");
            } else  {
                System.out.println("Whatever");
            }
        }while (greeting);
    }
}
