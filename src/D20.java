public class D20 {
    public static int rollD20(){ //static methods can be called back anywhere like on the D20 class as a whole/////
        // does not have to be called back on the instance class just like a Math method.
        return (int) (Math.random() * 20 +1);
    }
}
