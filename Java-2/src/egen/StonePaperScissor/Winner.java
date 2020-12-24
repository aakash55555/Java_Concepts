package egen.StonePaperScissor;

public class Winner {
	public Winner() {
	}

	public String matchWinner(String playerMove, String computerMove) {
		if (playerMove.equalsIgnoreCase(computerMove)) {
			return "Sorry, this match is a tie";
		} else if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissor"))
				|| (playerMove.equalsIgnoreCase("Scissor") && computerMove.equalsIgnoreCase("Paper"))
				|| (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))) {
			return "Hurray! You won";
		} else {
			return "Sorry, you lost...Better luck next time";
		}
	}
}
