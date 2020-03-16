package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "Y";

        while(answer.equalsIgnoreCase("Y")) {
            System.out.print("Введите математическое выражение: ");
            Calculator calculator = new Calculator(scan.nextLine());
            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [Y/N]: ");
                answer = scan.nextLine();
            } while(!(answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")));
        }
    }
}
