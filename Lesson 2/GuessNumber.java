import java.lang.Math;

public class GuessNumber {

	private int secretNum;

	GuessNumber () {
		secretNum = (int) ( Math.random() * 101 );
	}

	public int getSecretNum() {
		return secretNum;
	}

	public int playGame(int num) {
		if(num < secretNum) {
			return 0;
		} else if(num > secretNum) {
			return 1;
		} else {
			return 2;
		}
	}
	
}