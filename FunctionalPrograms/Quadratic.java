package Day5.FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double firstRoot;
        double secondRoot;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value a");
        double a = sc.nextDouble();

        System.out.println("Enter the value b");
        double b = sc.nextDouble();

        System.out.println("Enter the value c");
        double c = sc.nextDouble();
        double delta = (b * b) - (4 * a * c);
        double squrt = Math.sqrt(delta);
        firstRoot = (-b + squrt) / ( 2 * a);
        secondRoot = (-b - squrt) / (2 * a);
        System.out.println("The roots of given Quadratic Eqn are"  + firstRoot +"  and  " + secondRoot);
    }
}
