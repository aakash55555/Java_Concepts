package egen.StonePaperScissor;

import java.util.Random;

public class Computer {
	Random random;

	public Computer() {
		random = new Random();
	}

	public String computerMove() {
		String move;
		int number = random.nextInt(3) + 1;
		if (number == 1) {
			move = "Scissor";
		} else if (number == 2) {
			move = "Paper";
		} else {
			move = "Stone";
		}
		return move;
	}
}
