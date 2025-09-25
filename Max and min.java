import java.util.Scanner;

public class MaxMin {

    static int max, min;

    static void findMaxMin(int[] arr, int n) {
        if (n == 1) {           // base case
            max = min = arr[0];
            return;
        }
        findMaxMin(arr, n - 1); // recursion on first n-1
        if (arr[n - 1] > max) max = arr[n - 1];
        if (arr[n - 1] < min) min = arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        findMaxMin(arr, n);

        System.out.println("Max = " + max + ", Min = " + min);
    }
}
