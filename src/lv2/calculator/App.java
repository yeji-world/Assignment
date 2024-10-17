package lv2.calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        double answer = 0;

        for (;;) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            firstNumber = calculator.inputNumber();

            System.out.print("두 번째 숫자를 입력하세요: ");
            secondNumber = calculator.inputNumber();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            sc.nextLine();

            answer = calculator.calculate(operator, firstNumber, secondNumber);

            System.out.println("답 = " + answer);
            Queue<Double> resultList = calculator.getResult();
            resultList.add(answer);
            System.out.println("연산 결과: " + resultList);

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? remove를 입력 시 삭제됩니다.");
            calculator.removeResult();

            System.out.println("더 계산하시겠습니까? exit를 입력 시 종료됩니다.");
            String exit = sc.nextLine();
            if(exit.equals("exit")) {
                 System.out.println("프로그램을 종료합니다.");
                 break;
            }
        }
    }
}