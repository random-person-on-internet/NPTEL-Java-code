import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class stackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println("Is Empty : " + s.isEmpty());

        s.push(12);
        s.push(34);
        s.push(49);
        s.push(89);
        s.pop();
        // System.out.println(s);
        s.forEach(number -> {
            System.out.print(number + " ");
        });
        System.out.println();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(50);
        arr.add(82);
        s.addAll(arr);

        Iterator<Integer> si = s.iterator();
        while (si.hasNext()) {
            System.out.print(si.next() + " ");
        }
        System.out.println();
    }
}
