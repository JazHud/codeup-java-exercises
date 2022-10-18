public class PetTest {
    public static void main(String[] args) {
        Pets pet1 = new Pets();
        pet1.name = "Gizmo";
       pet1.speak = "Arff Arff";
        pet1.makeNoise();
//        String pet1Quote = pet1.Quote();

        Pets pet2 = new Pets();
        pet2.name = "Bob";
        pet2.speak = "AroOOOoo AroOOOoo";
        pet2.makeNoise();
//        String pet2Quote = pet2.Quote();

        Pets pet3 = new Pets();
        pet3.name = "Harley";
        pet3.speak = "Rrrr-Arff Arff Arff";
//        String pet3Quote = pet3.Quote();
        pet3.makeNoise();
    }
}
