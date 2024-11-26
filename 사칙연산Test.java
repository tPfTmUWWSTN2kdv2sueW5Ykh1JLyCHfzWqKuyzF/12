package week12;

public class 사칙연산Test {

    public static void main(String[] args) {
        // 두 개의 사칙연산 객체 생성 (정수와 실수)
        사칙연산 정수 = new 사칙연산(3, 4);
        사칙연산 실수 = new 사칙연산(6, 7);

        // 사칙연산 결과 출력
        System.out.println(정수);
        System.out.println(실수);
    }
}

class 사칙연산 {
    int num1;
    int num2;

    // 생성자 정의
    public 사칙연산(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 덧셈 메서드 추가
    public int add() {
        return num1 + num2;
    }

    // 뺄셈 메서드 추가
    public int subtract() {
        return num1 - num2;
    }

    // 곱셈 메서드 추가
    public int multiply() {
        return num1 * num2;
    }

    // 나눗셈 메서드 추가 (정수 나눗셈, 나눗셈 예외 처리)
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다."); // 나누기 0 에러 처리
        }
        return (double) num1 / num2;
    }

    // toString() 메서드 오버라이드 (사칙연산 결과를 모두 출력)
    @Override
    public String toString() {
        return "사칙연산 [" +
                "num1 = " + num1 + 
                ", num2 = " + num2 +
                ", 덧셈 = " + add() +
                ", 뺄셈 = " + subtract() +
                ", 곱셈 = " + multiply() +
                ", 나눗셈 = " + String.format("%.2f", divide()) + // 나눗셈 결과를 소수점 둘째자리까지 출력
                "]";
    }
}
