public class syntaxLecture {
    public static void main(String[] args) {
        // Declare variable without initializing
        int weight; //<-- ; is a must or will result in error
        String breed;
        // Initialize after declaration
        weight = 12;
        breed = "Shih tzu";
        //Initialize and declare all at same time
        String name = "Nikita";
        int cutenessFactor = 10;
//        // Statement: commands to the JVM to do something
//        System.out.println(name + " is a " + breed + ".");
//        //Conditional logic
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cutenes");
//        }
        boolean isNikitaCute = true;
        char oneLetter = 'a';
        byte smallNumber; // -128 to 127
        short shortName; // -32,769 to 32,767
        int number; // -2,147,483,648 to 2,147,483,647
        long bigNumber; // -9,223,372,036,854,775,808 to 9, 223,372,036,854,775,807

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

       ///the info below will be lost and only will return 0 because of wrong primitive data type
        number = 2000000000;
        smallNumber = (byte) number; ///casting when one type of data has to be converted into another
        System.out.println(smallNumber);

        bigNumber = 9000000000000000L; //L/l to help code to read this is a long primitive data type

        float imaFloat = 2.34F; //up to 6 decimals digits
        double imadouble = 9.012345567890123; //up to 15 decimal digits
        System.out.println(imadouble);
        imaFloat = (float) imadouble;
        System.out.println(imaFloat);
    }
}
