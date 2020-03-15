package com.startjava.lesson_4.game;

import java.util.Arrays;
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
        System.out.println("Игра началась! У вас 10 попыток");
        String nameP1 = player1.getName();
        String nameP2 = player2.getName();
        player1.clerNumbers();
        player2.clerNumbers();

        for(int i = 0; i < 10; i++) {
            System.out.println("Попытка № " + (i + 1));
            System.out.print(nameP1 + ", угадай какое число загадал компьютер?: ");
            player1.setNum(scan.nextInt(), i);

            System.out.print(nameP2 + ", угадай какое число загадал компьютер?: ");
            player2.setNum(scan.nextInt(), i);

            int numP1 = player1.getNum(i);
            if(secretNum > numP1) {
                System.out.println(nameP1 + ", ваше число МЕНЬШЕ загаданного");
            } else if(secretNum < numP1) {
                System.out.println(nameP1 + ", ваше число БОЛЬШЕ загаданного");
            } else {
                System.out.println(nameP1 + ", угадал число " + secretNum + " с " + (i + 1) + " попытки");
                break;
            }

            int numP2 = player2.getNum(i);
            if(secretNum > numP2) {
                System.out.println(nameP2 + ", ваше число  МЕНЬШЕ загаданного");
            } else if(secretNum < numP2) {
                System.out.println(nameP2 + ", ваше число  БОЛЬШЕ загаданного");
            } else {
                System.out.println(nameP2 + ", угадал число " + secretNum + " с " + (i + 1) + " попытки");
                break;
            }
        }

        System.out.print("Игрок " + nameP1 + " назвал числа: ");
        for(int i : player1.getNumbers()) {
            if(i > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        System.out.print("Игрок " + nameP2 + " назвал числа: ");
        for(int i : player2.getNumbers()) {
            if(i > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
