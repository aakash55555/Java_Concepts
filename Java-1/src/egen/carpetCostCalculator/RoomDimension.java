package carpetCostCalc;

/**
 * The Class RoomDimension.
 */
public class RoomDimension {

	/** The length of room. */
	double lengthOfRoom;

	/** The width of room. */
	double widthOfRoom;

	/**
	 * Instantiates a new room dimension.
	 *
	 * @param lengthOfRoom
	 *            the length of room
	 * @param widthOfRoom
	 *            the width of room
	 */
	public RoomDimension(double lengthOfRoom, double widthOfRoom) {
		this.lengthOfRoom = lengthOfRoom;
		this.widthOfRoom = widthOfRoom;
	}

	/**
	 * Area of room.
	 *
	 * @return the double
	 */
	public double areaOfRoom() {
		return lengthOfRoom * widthOfRoom;
	}

}
