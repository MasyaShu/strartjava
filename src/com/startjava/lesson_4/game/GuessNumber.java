package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private int secretNum;
    private Player[] players;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void playGame() {
        secretNum = (int) (Math.random() * 101);
        System.out.println("Игра началась! У вас 10 попыток");

        boolean isGameOver = false;
        for(int i = 0; i < 10; i++) {
            System.out.println("Попытка № " + (i + 1));
            enterNumber(i, players);

            for(Player player : players) {
                if(compareNumbers(player, i)) {
                    printNumbers(i, players);
                    clearNumbers(i, players);
                    isGameOver = true;
                    break;
                }
            }
            if(isGameOver) {
                break;
            }
        }
    }

    private void clearNumbers(int i, Player[] players) {
        for(Player player : players) {
            Arrays.fill(player.getNumbers(i), i);
        }
    }

    private void enterNumber(int i, Player[] players) {
        for(Player player : players) {
            String name = player.getName();
            System.out.print(name + ", угадай какое число загадал компьютер?: ");
            player.setNum(scan.nextInt(), i);
        }
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

    private void printNumbers(int i, Player[] players) {
        for(Player player : players) {
            System.out.print("Игрок " + player.getName() + " назвал числа: ");
            int [] attempts = player.getNumbers(i + 1);
            for(int num : attempts) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}
