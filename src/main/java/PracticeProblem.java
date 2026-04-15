/**
	* File: Lesson 4.6 - Data type checking
	* Author: Kaveeshan Sathasivam
	* Date Created: April 15, 2026
	* Date Last Modified: April 15, 2026
	*/
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static int intChecker() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input an integer: ");

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next(); // discard invalid input
            }
        }
    }

public static double doubleChecker() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input a number: ");

            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                input.next();
            }
        }
    }
    public static boolean booleanChecker() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input a boolean: ");

            if (input.hasNextBoolean()) {
                return input.nextBoolean();
            } else {
                input.next(); 
            }
        }
    }
  public static boolean multipleIntChecker() {
        Scanner input = new Scanner(System.in);

        int count = 0; 

        while (count < 4) {
            System.out.print("Input an integer: ");

            if (input.hasNextInt()) {
                input.nextInt(); 
                count++; 
            } else {
                input.next(); 
            }
        }

        return true;
    }

}
