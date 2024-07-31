class varargsMethod2 {
    static int sum(int n1, int... arr) {
        System.out.println("Length of array is : " + arr.length);

        int sum = n1;
        for (int a : arr) {
            sum += a;
        }

        return sum;
    }
}

public class varargs2 {
    public static void main(String[] args) {

        System.out.println(varargsMethod2.sum(1, 2, 3, 4, 5));
        System.out.println(varargsMethod2.sum(23));

    }
}
