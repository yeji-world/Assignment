package lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private ArrayList<Double> answer =  new ArrayList<>();

    public static int inputNumber(Scanner sc) {
        int number = 0;
        while (true) {
            try {
                number = sc.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.print("양의 정수를 입력하세요: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("양의 정수를 입력하세요: ");
                sc = new Scanner(System.in);
            }
        }
        return number;
    }


    public double calculate(String strOperator, int firstNumber, int secondNumber) {
        double answer = 0;
        boolean valid = true;
        char operator = strOperator.charAt(0);

        switch (operator) {
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
                break;
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    answer = firstNumber / secondNumber;
                } break;
        } return answer;
    }
}
