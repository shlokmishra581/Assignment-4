import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base cases: F(0)=0, F(1)=1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
