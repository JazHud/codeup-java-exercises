import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //WHILE LOOP=================================================
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
        //DO WHILE LOOP ADD 2=============================================
//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        //DO WHILE LOOP BACKWARDS FROM 5===================================
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // DO WHILE LOOP SQUARED===============================================
//        long i = 2L;
//        do{
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1000000);

        //FOR LOOP BACKWARDS FROM 5===================================
//        for(int i = 100; i >= 10; i-=5){
//            System.out.println(i);

        //FOR LOOP SQUARED===============================================
//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }
        //FOR LOOP FIZZBUZZ TEST============================================
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 != 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0 & i % 3 != 0) {
//                System.out.println("Buzz");
//                continue;
//            } else if (i % 3 == 0 | i % 5 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            } else {
//                System.out.println(i);
//            }
//        }

//        LOOP TABLE===================================
        Scanner sc = new Scanner(System.in);
        String goodUserAnswer = "yes";

           while(goodUserAnswer.equalsIgnoreCase("yes")){
               System.out.println("Enter a number to multiply: ");
            int userNumber = sc.nextInt();
               System.out.printf(" number | squared | cubed %n ------------------------%n");
            for (int i = 1; i <= userNumber; i++) {
                int numSquared = i * i;
                int numCubed = i * i * i;
                System.out.printf(" %-7d|%-9d|%-8d%n", i, numSquared, numCubed);
            }
            System.out.println("Would you like to Continue? (YES/NO)");
            goodUserAnswer = sc.next();
            System.out.println();
        }


        //LOOP CONVERTING GRADES TO LETTERS=====================
//        String userContinues = "yes";
//
//        while (userContinues.equalsIgnoreCase("yes")) {
//            System.out.println("Enter you number grade: ");
//            int userGrade = Integer.parseInt(sc.next());
//            if ((userGrade <= 100) & (userGrade >= 88)) {
//                System.out.printf("Your grade of %d equals to an A!%n", userGrade);
//            } else if ((userGrade <= 87) & (userGrade >= 80)) {
//                System.out.printf("Your grade of %d equals to a B!%n", userGrade);
//            } else if ((userGrade <= 79) & (userGrade >= 67)) {
//                System.out.printf("Your grade of %d equals to a C!%n", userGrade);
//            } else if ((userGrade <= 66) & (userGrade >= 60)) {
//                System.out.printf("Your grade of %d equals to a D.%n", userGrade);
//            } else if ((userGrade <= 59) & (userGrade > 0))
//                System.out.printf("Your grade of %d equals to a F.%n", userGrade);
//
//            System.out.println("Would you like to Continue? (YES/NO)");
//            userContinues = sc.next();
//            System.out.println();
//        }

        ///javier SLACK BONUS

        //Bonus exercise -- the PIN code (no longer exists -- requires a break; statement)
        //
        //You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When ran out of tries display "Sorry but you have been locked out."
        //program Starts:
        //```
        //Please enter pin:
        //22132
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //23412
        //Output:
        //Incorrect, try again.
        //Please enter pin:
        //12345
        //Output:
        //Correct, welcome back.

//        int correctPin = 333;
//        int attempts = 0;
//
//        System.out.println("Please enter your pin:");
//        int pinTry = sc.nextInt();
//        attempts++;
//
//        while(pinTry != correctPin && attempts <3){
//            System.out.println("Incorrect, try again.");
//            System.out.println("Please enter your pin:");
//            pinTry = sc.nextInt();
//            attempts++;
//        }
//        if (pinTry == correctPin) {
//            System.out.println("Correct, welcome back.");
//        } else if(attempts >= 3){
//            System.out.println("Sorry but you have been locked out.");
//        }
    }
    }


