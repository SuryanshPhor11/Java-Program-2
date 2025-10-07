import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary: " + bin);

        sc.close();
    }
}

