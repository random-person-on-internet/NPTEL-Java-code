import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Take values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value for row " + (i + 1) + " and column " + (j + 1) + " : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // print values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
