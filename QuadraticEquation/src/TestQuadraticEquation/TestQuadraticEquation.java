package TestQuadraticEquation ;

import java.util.Scanner;
import QuadraticEquation.QuadraticEquation;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Create object
        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double discriminant = eq.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("One root: " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        input.close();
    }
}

