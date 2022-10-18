import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num, int num1) {
        return num + num1;
    }

    ////////////////////////
    public static int subtraction(int num, int num1) {
        return num - num1;
    }

    ///////////////////////
    public static int multiplication(int num, int num1) {
        return num * num1;
    }

    ///////////////////////doubles for .decimal remainders
    public static double division(double num, double num1) {
        return num / num1;
    }

    ///////////////////////
    public static int modulus(int num, int num1) {
        return num % num1;
    }

    /////////////////////
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int intguess = sc.nextInt();
        if (intguess >= min && intguess <= max) {
            System.out.println("You guessed correctly!");
            return intguess;
        } else {
            System.out.println("That's out of range, :(...try aging: ");
            return getInteger(min, max);
        }
    }

    ///////////////////////////////////
    public static long factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int intGuess = sc.nextInt();
        //above two top and bottom lines can be a one liner JAVIER code has the solution
        long factorial = 1;
        if (intGuess >= 10 || intGuess <= 1)
            System.out.println("Please enter a number between 1 and 10: ");
        for (int i = intGuess; i > 0; i--) {
            //System.out.println(i);
            factorial *= i;
        }
        return (int) factorial;
    }

    public static long ranNum(int max) {
        return Math.round(Math.random() * max);
    }

    public static int rollDice() {
        System.out.println("Please enter the number of sides for the pair of your dice:");
        Scanner sc = new Scanner(System.in);
        int diceSides = sc.nextInt();
        System.out.println("Roll the dice...");
        System.out.printf("You rolled %d, and %d%n", ranNum(diceSides), ranNum(diceSides));
        System.out.println("Would you like to roll the die?");
        String userRollAnswer = sc.next();
        if (userRollAnswer.equalsIgnoreCase("yes")) {
            //long randomRoll = Math.round(Math.random() * diceSides);
            return rollDice();
        }
        return diceSides;
    }
//needs declared value for number of guesses and part of the condition
//    public static int guessingGame(){
//        int guesses = 0;
//        double compGuess = Math.round(Math.random() * 100);
//        while(true) {
//            int userGuess = sc.nextInt();
//            guesses++;
//
//            System.out.println("Welcome to the Guessing Game! Pick a number between 1 & 100: ");
//            Scanner sc = new Scanner(System.in);
//
//            if (userGuess > compGuess) {
//                System.out.println("LOWER");
//            } else if (userGuess < compGuess) {
//                System.out.println("HIGHER");
//            } else if (userGuess == compGuess) {
//                System.out.println("GOOD GUESS");
//            }
//            System.out.printf("Sorry the right number is %d.", compGuess);
//            return userGuess;
//
//
//        }while (guesses <= 3);
//  }

//////////=====================////////////////==========================
        public static void main (String[]args){
        ////KEEP MAIN METHODS AS SIMPLE AS POSSIBLE
/////  two solutions below for addition output====================================
//        int add = addition(3, 5);
//        System.out.println(add);
//
//        System.out.println(addition(3,5));
///////subtraction output ===============================================
//        System.out.println(subtraction(3,5));
//        ///multiplication output===============================================
//        System.out.println(multiplication(3,5));
//        ///division output=============================================
//        System.out.println(division(10, 5));
//        ///modulus output======================================================
//        System.out.println(modulus(10,5));
////number guess===================
//        getInteger(1,10);
            ////////factorial output=========================================
            ///BE WARNED SOME LOOPS CANTS BE USED WITHIN THE ORGINAL FUNCTION
            ///if you want to stay with in the orginal function just create a condition such as -> if (userAnswer.equals("YES") factorial();
//        String userAnswer = "yes";
//        do{
//            System.out.println(factorial());
//            System.out.println("Would you like to Continue? (YES/NO)");
//            Scanner sc = new Scanner(System.in);
//            userAnswer = sc.next();
//        }while (userAnswer.equalsIgnoreCase("yes"));
////=====Dice roll================================================
//        System.out.println(Math.round(Math.random() * 20));
            rollDice();

            /////////////////////////////////////
//        int guesses = 0;
//        do {
//            guesses++;
//            System.out.println(guessingGame());
//            guesses++;
//        } while (guesses <= 4);
        }
    }


