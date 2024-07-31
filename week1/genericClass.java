class genericMethods<T> {
    public void printArray(T[] arr) {
        for (T a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public T[] reverseArray(T[] arr) {
        int lastIndex = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }

        return arr;
    }
}

public class genericClass {
    public static void main(String[] args) {

        genericMethods<String> obj1 = new genericMethods<>();
        String[] strArray = { "Spiderman", "Superman", "Batman", "Ironman", "Dr", "Doom" };
        obj1.printArray(strArray);
        String[] revStrArray = obj1.reverseArray(strArray);
        obj1.printArray(revStrArray);

    }
}
