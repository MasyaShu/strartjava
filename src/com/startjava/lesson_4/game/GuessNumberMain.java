package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberMain {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        System.out.print("Первый игрок введите ваше имя: ");
        Player player1 = new Player(scan.nextLine());

        System.out.print("Второй игрок введите ваше имя: ");
        Player player2 = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(new Player[] {player1, player2});

        String answer = "Y";
        while(answer.equalsIgnoreCase("Y")) {
            guessNumber.playGame();

            do {
                System.out.print("Хотите продолжить? [Y/N]: ");
                answer = scan.next();
            } while(!(answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")));
        }
    }
}
