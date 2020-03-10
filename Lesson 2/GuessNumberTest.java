import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Первый игрок введите ваше имя: ");
		Player player1 = new Player(scan.nextLine());

		System.out.print("Второй игрок введите ваше имя: ");
		Player player2 = new Player(scan.nextLine());

		while(true) {
			GuessNumber guessNumber = new GuessNumber();
			guessNumber.playGame(player1, player2);

			boolean isExit = false;
				String reply;
				do {
					System.out.print("Хотите продолжить? [Y/N]: ");
					reply = scan.next();
					if(reply.equalsIgnoreCase("N")) {
						isExit = true;
					}
				} while(!(reply.equalsIgnoreCase("N") || reply.equalsIgnoreCase("Y")));

				if(isExit) {
					break;
			}
		}
	}
}	