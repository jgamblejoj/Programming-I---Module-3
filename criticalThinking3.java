import java.util.Scanner;
public class criticalThinking3 {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		// Set up variables
		int incomeGross;
		char taxRate;
		double taxWithholding = 0.00;
		// Print message to user and initialize scanner to set input to incomeGross
		System.out.println("Enter your gross weekly income as a whole number without a DOLLAR sign");
		incomeGross = scr.nextInt();
		
		// If-Statements
		if (incomeGross < 500) {
		    taxRate = 'A';
		} else if (incomeGross >= 500 && incomeGross < 1500) {
		    taxRate = 'B';
		} else if (incomeGross >= 1500 && incomeGross < 2500) {
		    taxRate = 'C';
		} else { // Covers incomeGross >= 2500
		    taxRate = 'D';
		}
		// Switch Statement
		switch (taxRate) {
		    case 'A':
		        taxWithholding = incomeGross * 0.1;
		        break;
		    case 'B':
		        taxWithholding = incomeGross * 0.15;
		        break;
		    case 'C':
		        taxWithholding = incomeGross * 0.2;
		        break;
		    case 'D':
		        taxWithholding = incomeGross * 0.3;
		        break;
		    default:
		        System.out.println("No tax withholding can be calculated at this time");
		        break;
		}
		System.out.printf("Your weekly average tax withholding amount is: $%.2f", taxWithholding);
	}
}
