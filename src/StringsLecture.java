import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        String teacher = "teacher";
        teacher = "Javier"; ///doesn't modify the first string just a new string aka new objects
                //String is an object which is stored somewhere else where the name is the reference to it.
        String javier = "Javier";

        System.out.println(teacher);
        System.out.println(javier);
        System.out.println(Integer.toHexString((System.identityHashCode(teacher))));//more accurate location of hashCode and its being translated from binary
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        System.out.println(teacher.hashCode()); /// both have the same reference
        System.out.println(javier.hashCode());
        System.out.println(javier == teacher);


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String userInput = sc.next();
        System.out.println(javier == userInput); /// false because it is not referencing the same haseCode above.
    }
}
