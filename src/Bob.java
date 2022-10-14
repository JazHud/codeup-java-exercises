import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean talkToBob = true;

         do {
             System.out.println("Talk to Bob a question: ");
             String askBob = sc.nextLine();
             if (askBob.endsWith("!")) {
                 System.out.println("Whoa, chill out!");
             } else if (askBob.endsWith("?")) {
                 System.out.println("Sure");
             } else if (askBob.equals("")) {
                 System.out.println("Fine. Be that way");
             } else {
                 System.out.println("Whatever");
             }
         } while (true);
        }
    }
