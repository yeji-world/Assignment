package lv2.calculator;

import java.util.*;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    private Queue<Double> result = new LinkedList<>();
    public Queue<Double> getResult() {
        return result;
    }
    public void setResult(LinkedList<Double> result) {
        this.result = result;
    }

    public void removeResult() {
        String remove = sc.nextLine();
        if(remove.equals("remove")) {
            result.poll();
            System.out.println("연산 결과: " + result);
        }
    }

    public static int inputNumber() {
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

    public double calculate(char operator, int firstNumber, int secondNumber) {
        double answer = 0;

        while (true) {
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
                            sc.nextLine();
                        } else {
                            answer = firstNumber / secondNumber;
                            break;
                        }
                    }
                } else {
                    System.out.print("사칙연산을 +, -, *, / 중에서 입력해주세요: ");
                    operator = sc.next().charAt(0);
                    sc.nextLine();
                    continue;
                } break;
            }
            return answer;
        }
    }
