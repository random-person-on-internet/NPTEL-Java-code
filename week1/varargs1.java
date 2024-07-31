class varargsMethod1 {
    static int sum(int a[]) {
        int ans = 0;
        for (int num : a) {
            ans += num;
        }

        return ans;
    }
}

public class varargs1 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        System.out.println(varargsMethod1.sum(arr));

    }
}
