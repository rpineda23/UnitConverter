package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		
		int menuSelect = 1;
		double quantity;
		Scanner scan = new Scanner(System.in);
		
		while(menuSelect > 0 && menuSelect < 7) {
			System.out.println("Please select a type of conversion:");
			System.out.print("* Volume\n"
							+ "	1. Cups to Teaspoons\n"
							+ "	2. US Gallons to Imperial Gallons\n"
							+ "* Distance\n"
							+ "	3. Feet to Meters\n"
							+ "	4. Miles to Kilometers\n"
							+ "* Time\n"
							+ "	5. Seconds to Minutes\n "	
							+ "	6. Minutes to Hours\n"
							+ "7. Quit\n");
			menuSelect = scan.nextInt();
			
			if(menuSelect == 7)
				System.exit(0);
			
			
			System.out.println("What is the quantity you want to convert?");
			quantity = scan.nextDouble();
			
			if(menuSelect == 1) 
				System.out.println("Teaspoons: " + convertCupstoTea(quantity));
			else if(menuSelect == 2) 
				System.out.println("Imperial Gallons: " + convertGallonstoImp(quantity));
			
			else if(menuSelect == 3) 
				System.out.println("Meters: " +convertFeettoMeters(quantity));
			else if(menuSelect == 4)
				System.out.println("Kilometers: " +convertMilestoKilo(quantity));
			
			else if(menuSelect == 5) 
				System.out.println("Minutes: " +convertSecondstoMin(quantity));
			else if(menuSelect == 6) 
				System.out.println("Hours: " + convertMinutestoHours(quantity));
		}
		scan.close();
	}
	
public static double convertCupstoTea(double input) {
	input = input * 48;
	return input;
}
public static double convertMilestoKilo(double input) {
	input = input * 1.609344;
	return input;
}
public static double convertGallonstoImp(double input) {
	input = input * 0.83267418;
	return input;
}
public static double convertFeettoMeters(double input) {
	input = input * 0.3048;
	return input;
}
public static double convertSecondstoMin(double input) {
	input = input * 0.0166667;
	return input;
}
public static double convertMinutestoHours(double input) {
	input = input * 0.0166667;
	return input;
}


}
