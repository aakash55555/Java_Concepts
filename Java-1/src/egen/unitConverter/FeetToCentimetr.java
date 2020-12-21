package unitConverter;

public class FeetToCentimetr {

	public long convertToCentimeter(long feet) {
		if(feet > 0.0f)
			return (long) (feet * 30.48);
		else
			System.out.println("It is not a valid input - negative number.");
		return 0;
	}

	/**
	 * Convert to centimeter.
	 *
	 * @param feet
	 *            the feet
	 * @return the double
	 */
	public double convertToCentimeter(double feet) {
		if(feet > 0.0f)
			return feet * 30.48;
		else
			System.out.println("It is not a valid input - negative number.");
		return 0;
	}
}
