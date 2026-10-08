package testlinearequation;

import java.util.Scanner;
import linearequation.LinearEquation;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Create object
        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.println("x = " + eq.getX() + ", y = " + eq.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}

