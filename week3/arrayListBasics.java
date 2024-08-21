import java.util.ArrayList;

public class arrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> birb = new ArrayList<>();
        birb.add("Peacock");
        birb.add("Parrot");

        ArrayList<String> animalKingdom = new ArrayList<>(birb);

        ArrayList<String> animal = new ArrayList<>();
        animal.add("lion");
        animal.add("leapord");
        animal.add("cat");

        animalKingdom.addAll(animal);
        animalKingdom.remove(3);
        System.out.println(animalKingdom);
    }
}