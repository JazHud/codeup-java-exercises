import java.io.FileReader;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);


// TO ENTER A NUMBER
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
        System.out.print("Enter a Number: ");
        int userInputNumber = scanner.nextInt();
            //number has to be entered or ImputMismatchException
        System.out.println("You entered: --> \"" + userInputNumber + "\" <--");
// TO ENTER 3 WORDS
//        scanner.nextLine();
//        System.out.println("Enter the first word: ");
//        String firstWord = scanner.next();
//        System.out.printf("The first word your entered was %s.%n", firstWord);
//
//        System.out.println("Enter the second word: ");
//        String secondWord = scanner.next();
//        System.out.printf("The second word your entered was %s.%n", secondWord);
//
//        System.out.println("Enter the third word: ");
//        String thirdWord = scanner.next();
//        System.out.printf("The third word your entered was %s.%n", thirdWord);
        ///////////ALTERNATIVE CODE//////////////////////
        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);

//code above as will seem to skill the second input, but it is really just reading it as enter until scanner.nexLine(); above the start of the new inputs is placed into the code


///// User sentence
        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence was: %s.%n", sentence);

////PERIMETER CALCULATION
//        scanner.nextLine();
//        System.out.print("Enter the room's Length: ");
//        int userInputLength = Integer.parseInt(scanner.nextLine());
////        scanner.nextLine();
//        System.out.print("Enter the room's width: ");
//        int userInputWidth = Integer.parseInt(scanner.nextLine());
//        int roomPerimeter = (userInputWidth * 2) + (userInputLength);
//        int roomArea = userInputWidth * userInputLength;
//        System.out.printf("The perimeter of the room is %s.%n", roomPerimeter);
//        System.out.printf("The area of the room is %s.%n", roomArea);

        System.out.print("Enter the room's Length: ");
        float userInputLength = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter the room's width: ");
        float userInputWidth = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter the room's height: ");
        float userInputHeight = Float.parseFloat(scanner.nextLine());

        float roomPerimeter = (userInputWidth * 2) + (userInputLength + 2);
        float roomVolume = userInputLength * userInputWidth * userInputHeight;
        float roomArea = userInputWidth * userInputLength;
        System.out.printf("The perimeter of the room is %.2f.%n", roomPerimeter);
        System.out.printf("The volume of the room is %.2f.%n", roomVolume);
        System.out.printf("The area of the room is %.2f.%n", roomArea);


//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words

        scanner.nextLine();
        System.out.println("Enter your quote here: ");
        String userQuote = scanner.nextLine();
        System.out.printf("The quote entered is: '%s'.%n", userQuote);

        System.out.println("How many words are in your quote?");
        int quoteNum = Integer.parseInt(scanner.nextLine());
        System.out.printf("The number of words you say is %s.%n", quoteNum);
        int quoteLng = userQuote.length(); /// gets all characters instead of just the word.
        System.out.printf("%s",quoteLng);


//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()
//
//


    }
}
