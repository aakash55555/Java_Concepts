package CarpetCostCalc;

/**
 * The Class RoomCarpet.
 */
public class RoomCarpet {

	/** The dimension. */
	private RoomDimension dimension;

	/** The carpet cost. */
	private double carpetCost;

	/**
	 * Instantiates a new room carpet.
	 *
	 * @param dimension
	 *            the dimension
	 * @param carpetCost
	 *            the carpet cost
	 */
	public RoomCarpet(RoomDimension dimension, double carpetCost) {
		this.dimension = dimension;
		this.carpetCost = carpetCost;
	}

	/**
	 * Total cost.
	 *
	 * @return the double
	 */
	public double totalCost() {
		return carpetCost * dimension.areaOfRoom();
	}
}
