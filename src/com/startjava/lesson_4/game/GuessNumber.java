package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private int secretNum;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        secretNum = (int) (Math.random() * 101);
        System.out.println("Игра началась! У вас 10 попыток");
        String nameP1 = player1.getName();
        String nameP2 = player2.getName();

        for(int i = 0; i < 10; i++) {
            System.out.println("Попытка № " + (i + 1));
            setNum(player1, i);
            setNum(player2, i);

            if(checkResults(player1, i)) {
                printNumbers(i + 1, player1);
                printNumbers(i + 1, player2);
                Arrays.fill(player1.getNumbers(i), i);
                Arrays.fill(player2.getNumbers(i), i);
                break;
            }

            if(checkResults(player2, i)) {
                printNumbers(i + 1, player1);
                printNumbers(i + 1, player2);
                Arrays.fill(player1.getNumbers(i), i);
                Arrays.fill(player2.getNumbers(i), i);
                break;
            }
        }
    }

    private void setNum(Player player, int i) {
        Scanner scan = new Scanner(System.in);
        String name = player.getName();

        System.out.print(name + ", угадай какое число загадал компьютер?: ");
        player.setNum(scan.nextInt(), i);
    }

    private boolean checkResults(Player player, int i) {
        String name = player.getName();
        int numP1 = player.getNum(i);

        if(secretNum > numP1) {
            System.out.println(name + ", ваше число МЕНЬШЕ загаданного");
            return false;
        } else if(secretNum < numP1) {
            System.out.println(name + ", ваше число БОЛЬШЕ загаданного");
            return false;
        } else {
            System.out.println(name + ", угадал число " + secretNum + " с " + (i + 1) + " попытки");
            return true;
        }
    }

    private void printNumbers(int i, Player player) {
        System.out.print("Игрок " + player.getName() + " назвал числа: ");
        int [] p1Numbers = player.getNumbers(i);
        for(int x : p1Numbers) {
                System.out.print(x + " ");
        }
        System.out.println("");
    }
}
