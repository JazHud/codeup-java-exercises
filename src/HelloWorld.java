public class HelloWorld {  //all java code lives in classes and within those class methods
    public static void main(String[] args) {   //<--main method::: where code starts running
        System.out.println("Hello, World"); //SHORTCUT -->  main then tab && sout then tab

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);
        //string is not compatible with number output
        String myString = "Learning Java basics!";
        System.out.println(myString);
        char newString = 's';
        //char newString1 = (char) "Three" //<--casting wont work
        //char is not compatible with a string output
        //putting a number as a value also will not work
        float myNumber = 3.14F;
        System.out.println(myNumber);
        //long myNumber must have a value to work
        // when value is float decimals make sure to add F, even if float is assigned
        // putting L on a small number still seems to work as if it wasn't there
//
//    int x = 5;
//    System.out.println(x++);
//    System.out.println(x);
//    // puls 1 is being executed after it is being displayed: output 5, 6
//    int x = 5;
//    System.out.println(++x);
//    System.out.println(x);
//    /// plus 1 is being executed before its being displayed: output 6, 6

//    string class = "hello";
    ///naming var as class will result in error;

        ///CAN'T FORCE DATA TYPES
//    String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
    //ERROR = Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:32)

//    int three = (int) "three";
    //ERROR = java: incompatible types: java.lang.String cannot be converted to int

    int x = 4;
    x += 5;
        System.out.println(x);


    int a = 3;
    int b = 4;
    a *= b;
        System.out.println(b);

    int c = 10;
    int d = 2;
    d -= (c /= d); //<-- = is needed to change the value of x
        System.out.println(c);
        System.out.println(d);

//    int maximumInteger = Integer.MAX_VALUE;
        int maximumInteger = 2147483647;
        maximumInteger++;
        System.out.println(maximumInteger);
        ///it should break the code but it loops into the negative showing now -2147483648; should use LONG  and L if we suspect number will be too big but it will take up more data.


    }

}
