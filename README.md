# Assignment

1️⃣ lv1 calculator

[전체]
- Scanner 클래스
  - 연산자, 피연산자 입력
- for문 
  - exit을 입력할 때까지 반복

[0을 포함한 양의 정수 입력받기]
- inputnumber 메서드
  - 피연산자 1,2에 공통으로 적용돼서 메서드 선언 및 구현
- while문
  - 올바른 값을 입력할 때까지 반복
- try...catch문
  - 정수 외의 값 입력 시 InputMismatchException 예외 처리
  - 안내 후 재입력
- if...else문
  - 음의 정수 입력 시 안내 후 재입력

[사칙연산 기호 입력받기]
- while문
  - 올바른 값을 입력할 때까지 반복
- charAt(0) 메서드
  - String인 sc.next()를 char로 형변환
- if...else if...else문
  - 사칙연산에 따른 answer 저장
  - 나누기에서 두번째 숫자가 0인 경우, 0으로 나눌 수 없음을 안내 후 재입력
  - +, -, *, / 외의 값 입력 시 안내 후 재입력

 
2️⃣ lv2 calculator

[Calculator 클래스]
- calculate 메서드
  - 결과값 반환 메서드 선언 및 구현
- Queue 컬렉션
  - 연산 결과를 저장하는 컬렉션
  - 가장 먼저 저장된 데이터를 삭제하는 컬렉션
  - remove 메서드로 결과값 삭제: poll 기능
  - 직접 접근하지 못하도록 접근 제어자 private
  - getter 메서드로 결과값 저장
 
[App 클래스]
- Calculator 클래스 인스턴스화
- inputNumber 메서드 호출
- 결과값 반환 calculate 메서드 호출
- 결과값 저장 getResult 메서드 호출
- 결과값 삭제 removeResult 메서드 호출
