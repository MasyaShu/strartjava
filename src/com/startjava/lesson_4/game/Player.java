package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private int[] numbers = new int[10];
    private String name;

    Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum(int i) {
        return numbers[i];
    }

    public void setNum(int num, int i) {
        this.numbers[i] = num;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
