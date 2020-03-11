import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	private int secretNum;
	private Player player1;
	private Player player2;

	GuessNumber (Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		Scanner scan = new Scanner(System.in);
		secretNum = (int) (Math.random() * 101);

		while(true) {
			System.out.print(player1.getName() + ", угадай какое число загадал компьютер?: ");
			player1.setNum(scan.nextInt());
				
			System.out.print(player2.getName() + ", угадай какое число загадал компьютер?: ");
			player2.setNum(scan.nextInt());

			if(secretNum > player1.getNum()) {
				System.out.println(player1.getName() + ", ваше число МЕНЬШЕ загаданного");
			} else if(secretNum < player1.getNum()) {
				System.out.println(player1.getName() + ", ваше число БОЛЬШЕ загаданного");
			} else {
				System.out.println(player1.getName() + ", ты угадал число " + secretNum + " и победил!");
				break;
			}

			if(secretNum > player2.getNum()) {
				System.out.println(player2.getName() + ", ваше число  МЕНЬШЕ загаданного");
			} else if(secretNum < player2.getNum()) {
				System.out.println(player2.getName() + ", ваше число  БОЛЬШЕ загаданного");
			} else {
				System.out.println(player2.getName() + ", ты угадал число " + secretNum + " и победил!");
				break;
			}
		}
	}
}
