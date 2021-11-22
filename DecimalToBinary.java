import java.util.Scanner;

// Program to convert decimal number to binary number

// @author: Oudone PKL

public class DecimalToBinary {
    
    // Method for convert decimal numbers to binary numbers
    public static void convertToBinary(int number) {
        System.out.println("The binary is " + Integer.toBinaryString(number));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal numer: ");

        // call the method
        convertToBinary(sc.nextInt());
    }
}
