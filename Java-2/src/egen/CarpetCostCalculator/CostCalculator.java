package CarpetCostCalc;

import java.util.Scanner;

public class CostCalculator {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out.println("------------Carpet Cost Calculator------------");
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the carpet type\n 1) Amazing \n 2) Alcova \n 3) Alluring" );
	    String carpetType = scan.next();
        
	    if(carpetType.equalsIgnoreCase("Amazing") || carpetType.equalsIgnoreCase("Alcova") || carpetType.equalsIgnoreCase("Alluring")) {
	    
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the room : ");
		double length = scan.nextDouble();

		System.out.print("Enter the width of the room : ");
		double width = scan.nextDouble();
		
		CarpetCost carpetCost = new CarpetCost();
		double cost = carpetCost.cost(carpetType);

		RoomDimension dimension = new RoomDimension(length, width);
		RoomCarpet carpetCost = new RoomCarpet(dimension, cost, carpetType);

		System.out.print("Total cost of carpet for the room : " + Math.ceil(carpetCost.totalCost()));
        }
	    
        else {
        	return "Invalid Carpet type";
        }
	}
}
