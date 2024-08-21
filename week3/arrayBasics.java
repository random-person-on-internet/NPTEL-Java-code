import java.util.Scanner;

class AllFunctions {
    int findRandomNumder(int min, int max) {
        int ans = (int) (Math.random() * ((max - min) + 1)) + min;
        return ans;
    }

    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
}

public class arrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllFunctions obj = new AllFunctions();

        // Generate random numbers
        int min = sc.nextInt();
        int max = sc.nextInt();

        System.out.println(obj.findRandomNumder(min, max));

        // Clone array
        int[] a = { 1, 2, 3, 4 };
        int[] b = a.clone();
        b = AllFunctions.reverseArray(b);

        AllFunctions.printArray(a);
        AllFunctions.printArray(b);

        sc.close();
    }
}