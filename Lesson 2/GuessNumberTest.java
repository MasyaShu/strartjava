import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print("Первый игрок введите ваше имя: ");
			Player player1 = new Player(scan.nextLine());

			System.out.print("Второй игрок введите ваше имя: ");
			Player player2 = new Player(scan.nextLine());

			GuessNumber guessNumber = new GuessNumber();

			while(true) {
				System.out.print(player1.getName() + ", угадай какое число загадал компьютер?: ");
				player1.setNum(scan.nextInt());
				
				System.out.print(player2.getName() + ", угадай какое число загадал компьютер?: ");
				player2.setNum(scan.nextInt());

				boolean equalNumPlayer = player1.getNum() == player2.getNum();

				if(guessNumber.playGame(player1.getNum()) == 0) {
					System.out.println(player1.getName() + ", ваше число МЕНЬШЕ загаданного");
				} else if(guessNumber.playGame(player1.getNum()) == 1) {
					System.out.println(player1.getName() + ", ваше число БОЛЬШЕ загаданного");
				} else {
					if(equalNumPlayer) {
						System.out.println(player1.getName() + " и " + player2.getName() + ", вы оба угадали  число: " + guessNumber.getSecretNum() + " Ничья!");
						break;
					} else {
						System.out.println(player1.getName() + ", ты угадал число " + guessNumber.getSecretNum() + " и победил!");
						break;
					}
				}

				if(guessNumber.playGame(player2.getNum()) == 0) {
					System.out.println(player2.getName() + ", ваше число  МЕНЬШЕ загаданного");
				} else if(guessNumber.playGame(player2.getNum()) == 1) {
					System.out.println(player2.getName() + ", ваше число  БОЛЬШЕ загаданного");
				} else {
					System.out.println(player2.getName() + ", ты угадал число " + guessNumber.getSecretNum() + " и победил!");
					break;
				}
			}
		
			boolean isExit = false;
			while(true) {
				scan.nextLine();
				System.out.print("Хотите продолжить? [Y/N]: ");
				String otvet = scan.next();
				if(otvet.equalsIgnoreCase("N")) {
					isExit = true;
					break;
				} else if(otvet.equalsIgnoreCase("Y")) {
					break;
				}
			}

			if(isExit) {
				break;
			}
		}
	}
}