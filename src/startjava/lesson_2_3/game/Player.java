package com.startjava.lesson_2_3.game;
public class Player {

	private int num;
	private String name;

	Player (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}