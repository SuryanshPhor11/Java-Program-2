import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal: " + decimal);

        sc.close();
    }
}

