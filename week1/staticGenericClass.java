class GenericClassDemo<T> {
    T t;

    GenericClassDemo(T t) {
        this.t = t;
    }

    void gPrint() {
        System.out.println(t);
    }
}

class staticGenericClass {
    public static void main(String[] args) {
        GenericClassDemo<Integer> obj1 = new GenericClassDemo<Integer>(12);
        obj1.gPrint();

        GenericClassDemo<String> obj2 = new GenericClassDemo<String>("Hello");
        obj2.gPrint();
    }
}