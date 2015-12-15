package java1;
import java.lang.Math;
import java.util.Scanner;

public class eth {
	public static void main(String[] args){

		// Scanner Creation
        Scanner input = new Scanner(System.in);

        // User Dialogue
        System.out.print("How many digits do you want to round e to: ");

        // Get User Input
        long numberRound = input.nextInt();

        // Calculate the Rounding Multiplier and the Rounded Number
        long multiplier = (long) Math.pow(10, numberRound);
        double roundedNumber = (double) Math.round(Math.E * multiplier) / multiplier;

        // Output the Rounded Number
        System.out.print(roundedNumber);

        // Close the Scanner
        input.close();
	}
}
