package carpetCostCalc;

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
		System.out.print("Enter the length of the room : ");
		double length = scan.nextDouble();

		System.out.print("Enter the width of the room : ");
		double width = scan.nextDouble();

		System.out.print("Enter the per feet cost of the carpet : ");
		double cost = scan.nextDouble();

		RoomDimension dimension = new RoomDimension(length, width);
		RoomCarpet carpetCost = new RoomCarpet(dimension, cost);

		System.out.print("Total cost of carpet for the room : " + Math.ceil(carpetCost.totalCost()));
	}
}
