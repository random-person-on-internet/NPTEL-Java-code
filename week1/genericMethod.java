class GenericFunction {
    static <T> void genericPrint(T t) {
        System.out.println(t);
    }
}

public class genericMethod {
    public static void main(String[] args) {

        GenericFunction.genericPrint(123);
        GenericFunction.genericPrint("Hello");

    }
}