class varargsMethod3 {
    static <T> void print(@SuppressWarnings("unchecked") T... arr) {
        System.out.println("Number of elements : " + arr.length);
        for (T a : arr) {
            System.out.print(a + " ");
        }
    }
}

public class varargs3 {
    public static void main(String[] args) {

        varargsMethod3.print(1, 2, 3);
        varargsMethod3.print("Spiderman", "Ironman", "Batman");

    }
}
