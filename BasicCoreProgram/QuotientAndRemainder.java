package Day5.BasicCoreProgram;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use scanner to Read numbers
        System.out.println("Enter dividend numbers:");
        int x = sc.nextInt();

        System.out.println("Enter divisor numbers:");
        int y = sc.nextInt();
        calculateQuotientAndReminder(x, y); // Call method to calculate Quotient and Reminder
    }
    private static void calculateQuotientAndReminder(int x, int y) {
        System.out.println(" Quotient = " + (x / y) + " Reminder = " + (x % y));
    }
}
