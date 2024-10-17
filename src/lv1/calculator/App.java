package lv1.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    private static int inputNumber() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        double answer = 0;

        for (;;) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNumber = inputNumber();

            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNumber = inputNumber();

            System.out.print("사칙연산 기호를 입력하세요: ");

            while(true) {
                String strOperator = sc.next();
                char operator = strOperator.charAt(0);

                if (operator == '+') {
                    answer = firstNumber + secondNumber;

                } else if (operator == '-') {
                    answer = firstNumber - secondNumber;

                } else if (operator == '*') {
                    answer = firstNumber * secondNumber;

                } else if (operator == '/') {
                    while (true) {
                        if (secondNumber == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            System.out.print("두 번째 숫자를 다시 입력하세요: ");
                            secondNumber = sc.nextInt();
                        } else {
                            answer = firstNumber / secondNumber;
                            break;
                        }
                    }
                } else {
                    System.out.print("사칙연산을 +, -, *, / 중에서 입력해주세요: ");
                    continue;
                } break;
            }
            System.out.println("답 = " + answer);
            System.out.println("더 계산하시겠습니까? exit를 입력 시 종료됩니다." );
            sc.nextLine();
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                 System.out.println("프로그램을 종료합니다.");
                 break;
            }
        }
    }
}