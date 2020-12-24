package egen.StonePaperScissor;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Result result = new Result();
		String systemMove;
		System.out.println("----------------ROCK PAPER SCISSOR GAME-------------");
		System.out.println("Enter a choice\n 1) Rock \n 2) Paper \n 3) Scissor");
		Scanner scanner = new Scanner(System.in);
		String playerMove = scanner.nextLine();
		boolean validate = result.validate(playerMove);
		Computer computer = new Computer();
		systemMove = computer.computerMove();
		System.out.println("Your computer has selected " + systemMove);
		Winner winner = new Winner();
		if (validate) {
			System.out.println(winner.matchWinner(playerMove, systemMove));
		} else {
			System.out.print("Invalid move by the player");
		}
	}

	public boolean validate(String move) {
		if (move.equalsIgnoreCase("Rock") || move.equalsIgnoreCase("Paper") || move.equalsIgnoreCase("Scissor")) {
			return true;
		} else {
			return false;
		}

	}

}
