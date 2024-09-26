package typecasting;

import java.util.Scanner;

public class ImplicitCastingQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 자동 형변환 퀴즈 ===");

        // 문제 1: 기본적인 자동 형변환
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        int i = 100;
        long l = i;
        float f = l;
        System.out.println(f);
        """);
        System.out.print("정답을 입력하세요: ");
        float answer1 = scanner.nextFloat();
        if (answer1 == 100.0f) {
            System.out.println("정답! int에서 long으로, 다시 float으로 자동 형변환이 일어납니다.");
        } else {
            System.out.println("오답! 정답은 100.0입니다. int에서 long으로, 다시 float으로 자동 형변환이 일어납니다.");
        }

        // 문제 2: char와 int의 자동 형변환
        System.out.println("\n문제 2: 다음 코드의 출력 결과는?");
        System.out.println("""
        char ch = 'A';
        int num = ch + 1;
        System.out.println(num);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 66) {
            System.out.println("정답! char 'A'는 int 65로 자동 변환되고, 1을 더해 66이 됩니다.");
        } else {
            System.out.println("오답! char 'A'는 int 65로 자동 변환되고, 1을 더해 66이 됩니다.");
        }

        // 문제 3: 정수 연산에서의 자동 형변환
        System.out.println("\n문제 3: 다음 코드의 출력 결과는?");
        System.out.println("""
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 30) {
            System.out.println("정답! byte 연산 결과는 자동으로 int로 변환되지만, 다시 byte로 명시적 형변환되어 30이 됩니다.");
        } else {
            System.out.println("오답! byte 연산 결과는 자동으로 int로 변환되지만, 다시 byte로 명시적 형변환되어 30이 됩니다.");
        }

        // 문제 4: 실수와 정수의 연산
        System.out.println("\n문제 4: 다음 코드의 출력 결과는?");
        System.out.println("""
        int i = 5;
        double d = 2.0;
        System.out.println(i / d);
        """);
        System.out.print("정답을 입력하세요: ");
        double answer4 = scanner.nextDouble();
        if (answer4 == 2.5) {
            System.out.println("정답! int가 double로 자동 형변환되어 실수 나눗셈이 수행됩니다.");
        } else {
            System.out.println("오답! int가 double로 자동 형변환되어 실수 나눗셈이 수행되므로, 결과는 2.5입니다.");
        }

        // 문제 5: 연산자 우선순위와 자동 형변환
        System.out.println("\n문제 5: 다음 코드의 출력 결과는?");
        System.out.println("""
        int i = 1;
        int j = 2;
        double d = 3.0;
        System.out.println(i + j * d);
        """);
        System.out.print("정답을 입력하세요: ");
        double answer5 = scanner.nextDouble();
        if (answer5 == 7.0) {
            System.out.println("정답! 곱셈이 먼저 수행되고, j가 double로 자동 형변환됩니다. 그 후 i도 double로 변환되어 덧셈이 수행됩니다.");
        } else {
            System.out.println("오답! 정답은 7.0입니다. 곱셈이 먼저 수행되고, j가 double로 자동 형변환됩니다. 그 후 i도 double로 변환되어 덧셈이 수행됩니다.");
        }

        System.out.println("\n자동 형변환 퀴즈를 완료했습니다!");
    }
}