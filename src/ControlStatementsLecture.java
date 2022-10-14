import java.util.Scanner;

public class ControlStatementsLecture {

    // Statements
    int myInteger = 30;

    public static void main(String[] args) {
        int x = 6;
        if (x == 5) {
            System.out.println("x is 5");
        } else if (x > 5 && x < 15) {
            System.out.printf("x is between 5 and 15.%n");
        } else {
        }


//    String customerChoice;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("What flavor do you want?");
//    customerChoice = scanner.next();
//
//        //// lambda function
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }

//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("strawberry coming right up");
//                break;
//            default:
//                System.out.println("We don't have that");
//                break;
//        }


//        boolean existence = true;
//        int theAnswer = 42;
////    if (existence) System.out.println("yes"); //condition is something like a boolean expression
//        if (existence || theAnswer++ == 42){
//
//        }
//        System.out.println(theAnswer);
//
//        int c = 0, d = 100, e = 50;
//        if (c == 1 && e++ < 100){ // &&, || only executes if the first condition is true e = 50 (doesn't fully run the code) FOR POST INCREMENTATION
//                                // &, | looks at both conditions not just the first e = 51 FOR POST INCREMENTATION
//        }
//        System.out.println("e = " + e);


        //////////WHILE LOOP////////////
//        int i = 1;
//        System.out.println("The loop hasn't started yet. The value of i is " + i);
//        while(i < 10){ //<--conditional test and will loop through until the conditional statement is false
//            System.out.println("Now i'm in the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented and its value is " + i);
//        }
//        System.out.println("the loop has ended because the conditional has tested false. The value of i is " + i);


        //////////DO WHILE LOOP////////////
//          int i = 1;
//        do {
//            System.out.println("Now i'm in the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented and its value is " + i);
//        } while (i < 10);
//        System.out.println("the loop has ended because the conditional has tested false. The value of i is " + i);
//
////////////////FOR LOOP//////////////
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }







    }
}


