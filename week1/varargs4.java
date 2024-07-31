class varargsMethod4 {
    static void print(Object... obj) {
        for (Object o : obj) {
            System.out.print(o + " ");
        }
    }
}

public class varargs4 {
    public static void main(String[] args) {

        varargsMethod4.print(1, 2.5, "ved", true);

    }
}
