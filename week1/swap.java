class SwapFunction {
    static <T> void mySwapFunction(T a, T b) {
        T temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}

public class swap {
    public static void main(String[] args) {

        int a = 14;
        int b = 100;
        SwapFunction.mySwapFunction(a, b);

        String stra = "Hello";
        String strb = "World";
        SwapFunction.mySwapFunction(stra, strb);

    }
}
