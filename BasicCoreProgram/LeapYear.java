package Day5.BasicCoreProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // year to be checked
        System.out.println("Enter Year to check it leap or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = false;

        if (year > 999 && year < 10000) {
            //not a leap year if not
            //divisible by 4
            if (year % 4 != 0) {
                isLeapYear = false;
            }
            //year is a leaf year if
            // divisible by 400
            else if (year % 400 == 0) {
                isLeapYear = true;
            }
            //other years are
            //not leaf year
            else if (year % 100 == 0) {
                isLeapYear = false;
            }
            //remaining years are leaf year
            else {
                isLeapYear = true;
            }
            if (isLeapYear) {
                System.out.println(year + " is a leaf year.");
            } else {
                System.out.println(year + " is not a leaf year.");
            }
        }
            else {
            System.out.println("Invalid year");
        }
    }
}
