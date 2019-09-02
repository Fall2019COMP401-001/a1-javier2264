package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();	
		String[] itemNames = new String[count];	
		double prices[] = new double[count];
		
		
		for (int i=0; i<count; i++) {
			itemNames[i] = scan.next();
			prices[i] = scan.nextDouble();	
		}
			
		int customers = scan.nextInt();
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		double[] totalCosts = new double[customers];
			
		for (int i=0; i<customers; i++) {	
			firstNames[i] = scan.next();	
			lastNames[i] = scan.next();	
			int items = scan.nextInt();
			 
			for (int j=0; j<items; j++) {
				totalCosts[i] += scan.nextInt() * getCost(scan.next(), itemNames, prices);
				
			}
		}
		int biggest = findBiggest(totalCosts);
		int smallest = findSmallest(totalCosts);
		double averageSpent = findAverageSpent(totalCosts);
		scan.close();
		
		System.out.println("Biggest: " + firstNames[biggest] + " " + lastNames[biggest] + "(" + String.format("%.2f",totalCosts[biggest]) + ")");
		System.out.println("Smallest: " + firstNames[smallest] + " " + lastNames[smallest] + "(" + String.format("%.2f",totalCosts[smallest]) + ")");
		System.out.println("Average: " + String.format("%.2f", averageSpent));
		}
		
public static double getCost(String vals, String[] itemNames, double[] num) {
	double cost = 0;
	for (int i=0; i<itemNames.length; i++) {
		if (itemNames[i] == vals ) {
			cost += num[i];
		}
	}
	return cost;
}

public static int findBiggest(double[] vals) {
	int biggest = 0;
	for (int i=0; i<vals.length; i++) {
		if (vals[i] > vals[biggest]) {
			biggest = i;
		}
	}
	return biggest;
}

public static int findSmallest(double[] vals) {
	int smallest = 0;
	for (int i=0; i<vals.length; i++) {
		if (vals[i] < vals[smallest]) {
			smallest = i;
		}
	}
	return smallest;
}

public static double findAverageSpent(double[] vals) {
	int average = 0;
	for (int i=0; i<vals.length; i++) {
		average += vals[i];
	}
	return average / vals.length;
}
	
}
