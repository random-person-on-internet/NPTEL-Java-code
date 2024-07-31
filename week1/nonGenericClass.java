class nonGenericMethod {
    // declating array
    // public static int[] declareArray(int size) {
    // int[] arr = new int[size];
    // return arr;
    // }

    // print array
    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a+ " ");
        }
        System.out.println();
    }

    // reversing array
    public static int[] reverseArray(int[] arr) {
        int midPoint = (arr.length) / 2;

        for (int i = 0; i < midPoint; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }
}

public class nonGenericClass {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        nonGenericMethod.printArray(arr);
        int[] revArr = nonGenericMethod.reverseArray(arr);
        nonGenericMethod.printArray(revArr);

    }
}
