package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Reads in total number of customers
		
		int count = scan.nextInt();
		
		for (int j=0; j<count; j++) {
		
			// Reads first name of the customer
			
			String firstName = scan.next();
			
			// Reads last names of customer
			
			String lastName = scan.next();
			
			// Reads number of items bought by customer
			
			int items = scan.nextInt();
			
			// Create an array to store numbers
			
			int[] quantities = new int[items];
			
			// Create an array to store names of purchased items
			
			String[] itemName = new String[items];
			
			// Create an array to store price values
			
			double[] prices = new double[items];
			
			// Initializes variable to hold total cost
			
			double total = 0;
			
			// Read values into arrays
		
			for (int i=0; i<items; i++) {
				quantities[i] = scan.nextInt();
				itemName[i] = scan.next();
				prices[i] = scan.nextDouble();
				total += (quantities[i] * prices[i]);
			}	
			// Convert total value to a string
			
			String totalString = String.format("%.2f", total);

			// Print results
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + totalString);
}
		// Close Scanner
		
		scan.close();
	}
}
