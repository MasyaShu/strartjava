import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {

	private int secretNum;

	GuessNumber () {
		secretNum = (int) ( Math.random() * 101 );
	}

	public void playGame(Player player1, Player player2) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print(player1.getName() + ", угадай какое число загадал компьютер?: ");
			player1.setNum(scan.nextInt());
				
			System.out.print(player2.getName() + ", угадай какое число загадал компьютер?: ");
			player2.setNum(scan.nextInt());

			boolean equalNumPlayer = player1.getNum() == player2.getNum();

			if(secretNum > player1.getNum()) {
				System.out.println(player1.getName() + ", ваше число МЕНЬШЕ загаданного");
			} else if(secretNum < player1.getNum()) {
				System.out.println(player1.getName() + ", ваше число БОЛЬШЕ загаданного");
			} else {
				if(equalNumPlayer) {
					System.out.println(player1.getName() + " и " + player2.getName() + ", вы оба угадали  число: " + secretNum + " Ничья!");
					break;
				} else {
					System.out.println(player1.getName() + ", ты угадал число " + secretNum + " и победил!");
					break;
				}
			}
			
			if(secretNum > player1.getNum()) {
				System.out.println(player2.getName() + ", ваше число  МЕНЬШЕ загаданного");
			} else if(secretNum < player1.getNum()) {
				System.out.println(player2.getName() + ", ваше число  БОЛЬШЕ загаданного");
			} else {
				System.out.println(player2.getName() + ", ты угадал число " + secretNum + " и победил!");
				break;
			}
		}
	}
}
