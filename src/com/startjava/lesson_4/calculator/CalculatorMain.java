package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply = "Y";

        while(reply.equalsIgnoreCase("Y")) {
            Calculator calculator = new Calculator();
            System.out.print("Введите математическое выражение: ");
            calculator.setExpression(scan.nextLine());
            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [Y/N]: ");
                reply = scan.nextLine();
            } while(!(reply.equalsIgnoreCase("N") || reply.equalsIgnoreCase("Y")));
        }
    }
}
