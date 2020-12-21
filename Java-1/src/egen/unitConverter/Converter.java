package unitConverter;

import java.util.Scanner;

public class Converter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		FeetToCentimetr feet = new FeetToCentimetr();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value in feet = ");
		double feet1 = scan.nextDouble();
		System.out.println("The value in centimeter = "+feet.convertToCentimeter(feet1));
		
		long feet2 = scan.nextLong();
		System.out.println("The value in centimeter = "+feet.convertToCentimeter(feet2));

	}

}
