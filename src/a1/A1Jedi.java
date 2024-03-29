package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] totalQuantities = new int[count];		
		int[] totalCustomers = new int[count];		
		
		for (int i=0; i<customers; i++) {
			int[] prevTotalCustomerNum = new int[count];

			firstNames[i] = scan.next();			
			lastNames[i] = scan.next();					
			int items = scan.nextInt();				
			
			for (int j=0; j<items; j++) {		

				int quantities = scan.nextInt();				
				String item = scan.next();				
				
				for (int k=0; k<count; k++) {					
					
					if (item.equals(itemNames[k])) {	
						totalQuantities[k] += quantities;	
						totalCustomers[k]++;
						if (prevTotalCustomerNum[k] > 0)
							totalCustomers[k]--;
					prevTotalCustomerNum[k]++;

					}
				}
			}
		
	}
		scan.close();
		
		for (int l=0; l<count; l++) {
			if (totalCustomers[l] == 0) {
				System.out.println("No customers bought " + itemNames[l]);
			} else {
				System.out.println(totalCustomers[l] + " customers bought " + totalQuantities[l] + " " + itemNames[l]);
			}
		}	
			
		
		
}
	}


