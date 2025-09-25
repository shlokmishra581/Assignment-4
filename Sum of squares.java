import java.util.Scanner;

public class Solution {

    static int sumOfSquares(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n * n + sumOfSquares(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = sumOfSquares(n);
        System.out.println("Sum of squares from 1 to " + n + " = " + sum);
    }
}
