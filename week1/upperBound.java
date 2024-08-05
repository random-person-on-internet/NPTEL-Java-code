class GenericBound<T extends Number> {
    T[] arr;

    GenericBound(T[] arr) {
        this.arr = arr;
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].doubleValue();
        }
        return sum / arr.length;
    }
}

class upperBound {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5 };
        GenericBound<Integer> obj1 = new GenericBound<Integer>(arr);
        System.out.println(obj1.average());

        Double arr2[] = { 1.2, 3.45, 12.43 };
        GenericBound<Double> obj2 = new GenericBound<Double>(arr2);
        System.out.println(obj2.average());
    }
}