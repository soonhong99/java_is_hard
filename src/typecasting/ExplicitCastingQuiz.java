package typecasting;

import java.util.Scanner;

public class ExplicitCastingQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 명시적 형변환 퀴즈 ===");

        // 문제 1: 기본적인 명시적 형변환
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        double d = 3.14;
        int i = (int) d;
        System.out.println(i);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 3) {
            System.out.println("정답! 실수에서 정수로 형변환 시 소수점 이하는 버려집니다.");
        } else {
            System.out.println("오답! 실수에서 정수로 형변환 시 소수점 이하는 버려집니다. 따라서 3이 출력됩니다.");
        }

        // 문제 2: char와 int 사이의 형변환
        System.out.println("\n문제 2: 다음 코드의 출력 결과는?");
        System.out.println("""
        int num = 65;
        char ch = (char) num;
        System.out.println(ch);
        """);
        System.out.print("정답을 입력하세요 (문자로): ");
        char answer2 = scanner.next().charAt(0);
        if (answer2 == 'A') {
            System.out.println("정답! int 65는 ASCII 코드에서 대문자 'A'에 해당합니다.");
        } else {
            System.out.println("오답! int 65는 ASCII 코드에서 대문자 'A'에 해당합니다.");
        }

        // 문제 3: 큰 정수에서 작은 정수로의 형변환 (오버플로우)
        System.out.println("\n문제 3: 다음 코드의 출력 결과는?");
        System.out.println("""
        int bigNum = 1000000;
        short smallNum = (short) bigNum;
        System.out.println(smallNum);
        """);
        System.out.print("정답을 입력하세요: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 16960) {
            System.out.println("정답! int에서 short로 형변환 시 상위 비트가 잘려나가 오버플로우가 발생합니다.");
        } else {
            System.out.println("오답! 정답은 16960입니다. int에서 short로 형변환 시 상위 비트가 잘려나가 오버플로우가 발생합니다.");
        }

        // 문제 4: 부동소수점 정밀도 손실
        System.out.println("\n문제 4: 다음 코드의 출력 결과는?");
        System.out.println("""
        double d = 1.0 / 3.0;
        float f = (float) d;
        System.out.println(f == d);
        """);
        System.out.print("정답을 입력하세요 (true/false): ");
        boolean answer4 = scanner.nextBoolean();
        if (!answer4) {
            System.out.println("정답! double에서 float으로 형변환 시 정밀도 손실로 인해 값이 달라집니다.");
        } else {
            System.out.println("오답! double에서 float으로 형변환 시 정밀도 손실로 인해 값이 달라져 false가 출력됩니다.");
        }

        // 문제 5: 음수 형변환
        System.out.println("\n문제 5: 다음 코드의 출력 결과는?");
        System.out.println("""
        int negNum = -1;
        System.out.println((unsigned int) negNum);
        """);
        System.out.print("정답을 입력하세요: ");
        long answer5 = scanner.nextLong();
        if (answer5 == 4294967295L) {
            System.out.println("정답! 음수를 unsigned int로 형변환하면 2^32 - 1이 됩니다.");
        } else {
            System.out.println("오답! 음수를 unsigned int로 형변환하면 2^32 - 1, 즉 4294967295가 됩니다.");
        }

        System.out.println("\n명시적 형변환 퀴즈를 완료했습니다!");
    }
}