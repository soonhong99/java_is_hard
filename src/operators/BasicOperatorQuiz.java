package operators;

import java.util.Scanner;

public class BasicOperatorQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 기본 연산자 퀴즈 ===");

        // 문제 1: 증감 연산자
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        """);
        System.out.print("정답을 입력하세요 (1) 5, 5 (2) 5, 6 (3) 6, 6 : ");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            System.out.println("정답! x++는 후위 증가 연산자로, 현재 값을 먼저 사용한 후 증가시킵니다.");
        } else {
            System.out.println("오답! x++는 후위 증가 연산자입니다. 첫 번째 출력에서는 5가, 두 번째 출력에서는 증가된 6이 출력됩니다.");
        }

        // 문제 2: 복합 대입 연산자
        System.out.println("\n문제 2: 다음 코드의 y 값은?");
        System.out.println("""
        int y = 10;
        y += 5 * 2;
        """);
        System.out.print("정답을 입력하세요: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 20) {
            System.out.println("정답! y += 5 * 2는 y = y + (5 * 2)와 같습니다.");
        } else {
            System.out.println("오답! y += 5 * 2는 y = y + (5 * 2)와 같으므로, 결과는 20입니다.");
        }


        // 문제 2: 복합 대입 연산자
        System.out.println("\n문제 3: 다음 코드의 y 값은?");
        System.out.println("""
        int y = 10;
        y += 5 * 2;
        """);
        System.out.print("정답을 입력하세요: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 20) {
            System.out.println("정답! y += 5 * 2는 y = y + (5 * 2)와 같습니다.");
        } else {
            System.out.println("오답! y += 5 * 2는 y = y + (5 * 2)와 같으므로, 결과는 20입니다.");
        }

        // 문제 3: 비교 연산자와 논리 연산자
        System.out.println("\n문제 4: 다음 표현식의 결과는?");
        System.out.println("5 > 3 && 10 <= 10 || false");
        System.out.print("정답을 입력하세요 (1) true (2) false : ");
        int answer4 = scanner.nextInt();
        if (answer4 == 1) {
            System.out.println("정답! 연산자 우선순위에 따라 (5 > 3) && (10 <= 10)가 먼저 평가되고, 그 결과와 false가 OR 연산됩니다.");
        } else {
            System.out.println("오답! (5 > 3) && (10 <= 10)는 true이고, true || false의 결과는 true입니다.");
        }

        // 문제 4: 나머지 연산자
        System.out.println("\n문제 5: -5 % 2의 결과는?");
        System.out.print("정답을 입력하세요: ");
        int answer5 = scanner.nextInt();
        if (answer5 == -1) {
            System.out.println("정답! 나머지 연산자의 결과는 피제수(나누어지는 수)의 부호를 따릅니다.");
        } else {
            System.out.println("오답! 나머지 연산자의 결과는 -1입니다. 부호는 피제수(-5)의 부호를 따릅니다.");
        }

        // 문제 5: 비트 연산자
        System.out.println("\n문제 6: 5 & 3의 결과는? (비트 AND 연산)");
        System.out.print("정답을 입력하세요: ");
        int answer6 = scanner.nextInt();
        if (answer6 == 1) {
            System.out.println("정답! 5(101)와 3(011)의 비트 AND 연산 결과는 1(001)입니다.");
        } else {
            System.out.println("오답! 5(101)와 3(011)의 비트 AND 연산 결과는 1(001)입니다.");
        }

        System.out.println("\n기본 연산자 퀴즈를 완료했습니다!");
    }
}