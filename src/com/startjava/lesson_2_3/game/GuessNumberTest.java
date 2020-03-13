package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Первый игрок введите ваше имя: ");
		Player player1 = new Player(scan.nextLine());

		System.out.print("Второй игрок введите ваше имя: ");
		Player player2 = new Player(scan.nextLine());

		GuessNumber guessNumber = new GuessNumber(player1, player2);

		String reply = "Y";
		while(reply.equalsIgnoreCase("Y")) {
			guessNumber.playGame();

			do {
				System.out.print("Хотите продолжить? [Y/N]: ");
				reply = scan.next();
			} while(!(reply.equalsIgnoreCase("N") || reply.equalsIgnoreCase("Y")));
		}
	}
}