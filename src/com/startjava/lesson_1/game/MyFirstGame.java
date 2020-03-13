package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int input = 1;
		int secretNum = 19;
		
		while(true) {
			if(input > secretNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				input--;
			} else if(input < secretNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				input++;
			} else {
				break;
			}
		}
		System.out.println("Вы угадали!");
	}
}