import java.util.LinkedList;
import java.util.Iterator;

public class linkedListUsingJCF {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();

        obj.add("Peacock");
        obj.add("Bald Eagle");
        obj.add("Ostrich");
        obj.add("Kiwi");
        obj.add("Frog");
        obj.add("Canada Jay");

        obj.remove("Frog");

        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
