package com.example.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = 0;
//
//        while (!sc.hasNextInt() || (sc.nextInt() < 0)) {
//            System.out.print("양의 정수를 입력하세요: ");
//            firstNumber = sc.nextInt();
//            if (firstNumber >= 0) {
//                break;
//            } else {
//                System.out.print("양의 정수를 입력하세요: ");
//            }
//        }

            while (true) {
                try {
                    firstNumber = sc.nextInt();
                    if (firstNumber >= 0) {
                        break;
                    } else {
                        System.out.print("양의 정수를 입력하세요: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("양의 정수를 입력하세요: ");
                    sc = new Scanner(System.in);
                }
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = 0;

//        while (!sc.hasNextInt() || (sc.nextInt() < 0)) {
//            System.out.print("양의 정수를 입력하세요: ");
//            secondNumber = sc.nextInt();
//            if (secondNumber >= 0) {
//                break;
//            } else {
//                System.out.print("양의 정수를 입력하세요: ");
//            }
//        }

            while (true) {
                try {
                    secondNumber = sc.nextInt();
                    if (secondNumber >= 0) {
                        break;
                    } else {
                        System.out.print("양의 정수를 입력하세요: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("양의 정수를 입력하세요: ");
                    sc = new Scanner(System.in);
                }
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            String strOperator = sc.next();

            char operator = strOperator.charAt(0);

            if (operator == '+') {
                double answer = firstNumber + secondNumber;
                System.out.println("답 = " + answer);
            } else if (operator == '-') {
                double answer = firstNumber - secondNumber;
                System.out.println("답 = " + answer);
            } else if (operator == '*') {
                double answer = firstNumber * secondNumber;
                System.out.println("답 = " + answer);
            } else if (operator == '/') {
                while (true) {
                    if (secondNumber == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        System.out.print("두 번째 숫자를 다시 입력하세요: ");
                        secondNumber = sc.nextInt();
                    } else {
                        double answer = firstNumber / secondNumber;
                        System.out.println("답 = " + answer);
                        break;
                    }
                }
            } else {
                System.out.println("사칙연산을 +, -, *, / 중에서 입력해주세요.");
            }
            System.out.println("더 계산하시겠습니까? exit를 입력 시 종료됩니다." );
            String end = sc.nextLine();
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                 System.out.println("프로그램을 종료합니다.");
                 break;
            }
        }
    }
}