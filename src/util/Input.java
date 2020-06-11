package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String getString() {
        return this.sc.next();
    }

    public boolean yesNo() {
        return this.sc.next().equalsIgnoreCase("y") || this.sc.next().equalsIgnoreCase("yes");
    }

    public int getInt(){
        return this.sc.nextInt();
    }

    public double getDouble(){
        if(sc.hasNextDouble()){
            return sc.nextDouble();
        }else {
            System.out.println("Invalid number");
            sc.next();
            return getInt();
        }
    }

    public int getInt(int min, int max){
        boolean gc =  true;
        while (gc){
            if (this.sc.nextInt() >= min && this.sc.nextInt() <= max){
                gc = false;
                return this.sc.nextInt();
            } else {
                System.out.printf("Please pick an integer withing range. \n Enter an integer between %d and %d" , min, max);
            }
        }return getInt();
    }
}
