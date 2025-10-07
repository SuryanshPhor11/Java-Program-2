import java.util.Scanner;

public class SumRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
