import java.util.Scanner;

public class ConsoleIOLecuture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F; ///number isn't 100% accurate because it's translating it from binary and back
        System.out.printf("Good, %s %s!%n", timeOfDay, cohort);//won't create a new lint like .println;;; the order over variables at the end of the line determines which comes first!
        System.out.printf("This is the %dth week of %s cohort.%n", week , cohort);
        System.out.println("On the same line");// %n added above, so it will be on two different lines
        System.out.println("I have my own line!");
        System.out.printf("The number is %08.2f%n", someNumber);// 0 fills the number of spaces the number following declares in this case 8 including the decimal point the .2 declares how many decimal digits = however this code can not reduce the overall number given.

        ///to get user input have to reference the scanner library in the utils folder///
        // scanner is a object with methods
        Scanner scanner = new Scanner(System.in);  //|
        System.out.println("enter a word:");       //| these two lines to allow the user to input something

//        String userInput = scanner.next();                     //stored the userInput as a var only one word
        String userInput = scanner.nextLine();                  // stores entire line as a string
        System.out.printf("Your word was %s.%n", userInput);    // output the whatever string wanted and the userInput

        System.out.println("Enter a number:");
        //int userNumber = scanner.nextInt(); // to store the userNumber as a int //has to be used with GHOST!!
        int userNumber = Integer.parseInt(scanner.nextLine());
        System.out.printf("Your number was %d.%n", userNumber);

        System.out.println("Enter a sentence: ");
        //String ghost = scanner.nextLine(); ///GHOST has to be added so the input can be read more than just an enter or a space!!!
        //scanner.nextLine();                 /// aslo to bypass the input on enter or space error
        //String userInput2 = scanner.next() + scanner.nextLine(); // also to bypass the input on enter or space error
        String userInput2 = scanner.nextLine();
        System.out.printf("Your sentences was %s.%n", userInput2);
        System.out.println("Enter another sentence:");
        String secondSentence = scanner.nextLine();
        System.out.printf("Your second sentence was %s.%n", secondSentence);


    }
}
