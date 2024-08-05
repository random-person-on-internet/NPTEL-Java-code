class GenericClass<T> {
    T obj;

    GenericClass(T obj) {
        this.obj = obj;
    }

    public void print(T obj) {
        System.out.println(obj);
    }
}