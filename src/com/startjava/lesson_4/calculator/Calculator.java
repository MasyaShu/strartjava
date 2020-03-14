package com.startjava.lesson_4.calculator;

public class Calculator {

    private String expression;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void calculate() {
       String[] s = expression.split(" ");
       char sign = s[1].charAt(0);
       int a = Integer.parseInt(s[0]);
       int b = Integer.parseInt(s[2]);
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
