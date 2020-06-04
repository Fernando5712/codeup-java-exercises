import java.util.Scanner;

public class ConsoleExercises {
        public static void main(String[] args) {
            double pi = 3.14159;

            Scanner scanner = new Scanner(System.in);
//            String wordOne = scanner.next();
//            String wordTwo = scanner.next();
//            String wordThree = scanner.next();
//            scanner.nextLine();




            System.out.printf("the value of pi is approximately %.2f" , pi);
            System.out.println("Please enter three words");
            System.out.println("Please type a sentence");
//            System.out.println(wordOne);
//            System.out.println(wordTwo);
//            System.out.println(wordThree);

//            int i = 5;
//            while (i <= 15){
//                System.out.println(" the value of i is " + i);
//                i++;
//            }

            for (int i = 0; i < 15; i++ )
                System.out.println(i);
//
//            int t = 0;
//            do {
//                t += 2;
//                System.out.println(t);
//            } while (t <= 98);

            for (int t = 0; t <= 100; t += 2)
                System.out.println(t);
//
//            int m = 100;
//            do {
//                m -= 5;
//                System.out.println(m);
//            } while (m >= -5);
//
            for (int b = 100; b >= -10; b -= 2)
                System.out.println(b);


//            double mil = 2;
//            do {
//                mil *= mil;
//                System.out.println(mil);
//            }while (mil <= 9998);

            for (int mil = 2; mil <= 10000; mil *= mil)
                System.out.println(mil);

            for (int g = 1; g <= 100; g++){
                if (((g % 3) == 0) && ((g % 5) == 0)){
                    System.out.println("FizzBuzz ");
                } else if (g % 5 == 0)   {
                    System.out.println("Buzz ");
                } else if (g % 3 == 0) {
                    System.out.println("Fizz ");
                } else {
                    System.out.println(g);
                }
            }

            System.out.println("insert a number");
            int num = scanner.nextInt();

                    System.out.println("Table");
                    System.out.println("number-----|Squared-----|Cubed-----|");
                    System.out.println("-----------|------------|----------|");

                    for (
                            int i = 1;
                            i <= num; i++) {
                        System.out.printf("%d------|%d-----------|%d-------|%n", i, i * i, i * i * i);
                    }
                }
            }


