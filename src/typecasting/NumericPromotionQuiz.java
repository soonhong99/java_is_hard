package typecasting;

import java.util.Scanner;

public class NumericPromotionQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 숫자형 승격 퀴즈 ===");

        // 문제 1: 기본적인 숫자형 승격
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((int)result);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 50773) {
            System.out.println("정답! 연산 과정에서 모든 값이 double로 승격되어 계산됩니다.");
        } else {
            System.out.println("오답! 정답은 50773입니다. 연산 과정에서 모든 값이 double로 승격되어 계산됩니다.");
        }

        // 문제 2: int보다 작은 타입의 연산
        System.out.println("\n문제 2: 다음 코드의 출력 결과는?");
        System.out.println("""
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 30) {
            System.out.println("정답! byte끼리의 연산 결과는 int로 승격되지만, 명시적 캐스팅으로 다시 byte로 변환됩니다.");
        } else {
            System.out.println("오답! byte끼리의 연산 결과는 int로 승격되지만, 명시적 캐스팅으로 다시 byte로 변환되어 30이 됩니다.");
        }

        // 문제 3: char 타입의 승격
        System.out.println("\n문제 3: 다음 코드의 출력 결과는?");
        System.out.println("""
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 + c2);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 195) {
            System.out.println("정답! char 타입은 연산 시 int로 승격되어 계산됩니다. 'a'의 ASCII 값 97과 'b'의 ASCII 값 98의 합이 출력됩니다.");
        } else {
            System.out.println("오답! char 타입은 연산 시 int로 승격되어 계산됩니다. 'a'의 ASCII 값 97과 'b'의 ASCII 값 98의 합인 195가 출력됩니다.");
        }

        // 문제 4: long과 float의 연산
        System.out.println("\n문제 4: 다음 코드의 출력 결과는?");
        System.out.println("""
        long l = 1234567890123L;
        float f = l;
        System.out.println(f == l);
        """);
        System.out.print("정답을 입력하세요 (true/false): ");
        boolean answer4 = scanner.nextBoolean();
        if (!answer4) {
            System.out.println("정답! long 값이 float로 변환될 때 정밀도 손실이 발생하여 두 값은 같지 않습니다.");
        } else {
            System.out.println("오답! long 값이 float로 변환될 때 정밀도 손실이 발생하여 두 값은 같지 않습니다. 따라서 결과는 false입니다.");
        }

        // 문제 5: 복합 대입 연산자와 승격
        System.out.println("\n문제 5: 다음 코드의 출력 결과는?");
        System.out.println("""
        byte b = 10;
        b += 5.5;
        System.out.println(b);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer5 = scanner.nextInt();
        if (answer5 == 15) {
            System.out.println("정답! 복합 대입 연산자는 암묵적 캐스팅을 수행합니다. 5.5가 더해진 후 결과가 byte로 변환됩니다.");
        } else {
            System.out.println("오답! 복합 대입 연산자는 암묵적 캐스팅을 수행합니다. 5.5가 더해진 후 결과가 byte로 변환되어 15가 됩니다.");
        }

        System.out.println("\n숫자형 승격 퀴즈를 완료했습니다!");
    }
}