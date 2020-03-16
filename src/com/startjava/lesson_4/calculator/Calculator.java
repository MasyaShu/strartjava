package com.startjava.lesson_4.calculator;

public class Calculator {

    private String srcExpression;

    public Calculator(String srcExpression) {
        this.srcExpression = srcExpression;
    }

    public String getExpression() {
        return srcExpression;
    }

    public void calculate() {
       String[] splitExpression = srcExpression.split(" ");
       char sign = splitExpression[1].charAt(0);
       int a = Integer.parseInt(splitExpression[0]);
       int b = Integer.parseInt(splitExpression[2]);
       switch(sign) {
            case '+':
                System.out.println(Math.addExact(a, b));
                break;
            case '-':
                System.out.println(Math.subtractExact(a, b));
                break;
            case '/':
                if(b != 0) {
                    System.out.println(Math.floorDiv(a, b));
                }
                break;
            case '*':
                System.out.println(Math.multiplyExact(a, b));
                break;
            case '%':
                System.out.println(Math.IEEEremainder(a, b));
                break;
            case '^':
                System.out.println(Math.pow(a, b));
                break;
        }
    }
}
