package operators;

import java.util.Scanner;

public class FloatingPointQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 부동소수점 연산 퀴즈 ===");

        // 문제 1: 부동소수점 연산 오류
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b == 0.3);
        """);
        System.out.print("정답을 입력하세요 (1) true (2) false : ");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            System.out.println("정답! 부동소수점의 이진 표현 한계로 인해 0.1 + 0.2는 정확히 0.3이 되지 않습니다.");
        } else {
            System.out.println("오답! 부동소수점의 이진 표현 한계로 인해 0.1 + 0.2는 정확히 0.3이 되지 않습니다. " +
                    "이런 비교를 할 때는 오차 범위를 설정하여 비교해야 합니다.");
        }

        // 추가 문제들...

        System.out.println("\n부동소수점 연산 퀴즈를 완료했습니다!");
    }
}