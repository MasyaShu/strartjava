package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        secretNum = (int) (Math.random() * 101);
        System.out.println("Игра началась! У вас 10 попыток");

        for(int i = 0; i < 10; i++) {
            System.out.println("Попытка № " + (i + 1));
            enterNumber(player1, i);
            enterNumber(player2, i);

            if(compareNumbers(player1, i)) {
                printNumbers(i, player1);
                printNumbers(i, player2);
                clearNumbers(i, new Player[] {player1, player2});
                break;
            }

            if(compareNumbers(player2, i)) {
                printNumbers(i, player1);
                printNumbers(i, player2);
                clearNumbers(i, new Player[] {player1, player2});
                break;
            }
        }

    }

    private void clearNumbers(int i, Player[] players) {
        for(Player player : players) {
            Arrays.fill(player.getNumbers(i), i);
        }
    }

    private void enterNumber(Player player, int i) {
        String name = player.getName();

        System.out.print(name + ", угадай какое число загадал компьютер?: ");
        player.setNum(scan.nextInt(), i);
    }

    private boolean compareNumbers(Player player, int i) {
        String name = player.getName();
        int num = player.getNum(i);

        if(secretNum > num) {
            System.out.println(name + ", ваше число МЕНЬШЕ загаданного");
        } else if(secretNum < num) {
            System.out.println(name + ", ваше число БОЛЬШЕ загаданного");
        } else {
            System.out.println(name + ", угадал число " + secretNum + " с " + (i + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void printNumbers(int i, Player player) {
        System.out.print("Игрок " + player.getName() + " назвал числа: ");
        int [] attempts = player.getNumbers(i + 1);
        for(int num : attempts) {
                System.out.print(num + " ");
        }
        System.out.println("");
    }
}
