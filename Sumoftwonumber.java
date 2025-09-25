import java.util.Scanner;

public class Solution  {

    static long sumOfPowers(int n) {
        if (n == 0) {
            return 1; // base case: 2^0 = 1
        }
        return (long)Math.pow(2, n) + sumOfPowers(n - 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = sumOfPowers(n);
        System.out.println("Sum of powers of 2 from 2^0 to 2^" + n + " = " + sum);
    }
}
