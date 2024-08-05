class GenericClass<T, V> {
    T obj1;
    V obj2;

    GenericClass(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;

        System.out.println(obj1);
        System.out.println(obj2);
    }
}

public class staticGenericClass2 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        GenericClass<Integer, String> a = new GenericClass<Integer, String>(103, "Hello");
    }
}