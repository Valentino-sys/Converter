package com.company;

import java.util.Scanner;

public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private String operator;
    Scanner scanner;

    public void calculate() {
        scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");

        while (!scanner.hasNextDouble()) {
            System.out.println("Opps ,  enter correct operator");
            scanner.next();
        }
        number1 = scanner.nextDouble();

        while (!scanner.hasNextDouble()) {
            System.out.println("Opps ,  enter correct operator");
            scanner.next();
        }
        number2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        operator = scanner.next();


        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number1 == 0 | number2 == 0) {
                    System.out.println("You can't divide by zero");
                    return;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Opps ,  enter correct operator");
                return;
        }
        String roundedResult = String.format("%.3f", result);

        System.out.println("Operation result : ");
        System.out.println(number1 + " " + operator + " " + number2 + " = " + roundedResult);
    }
}
