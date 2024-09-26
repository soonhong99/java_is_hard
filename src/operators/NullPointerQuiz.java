package operators;

import java.util.Scanner;

public class NullPointerQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Null Pointer 예외 퀴즈 ===");

        // 문제 1: Null Pointer Exception
        System.out.println("\n문제 1: 다음 코드의 실행 결과는?");
        System.out.println("""
        String str = null;
        if (str.equals("Hello")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        """);
        System.out.print("정답을 입력하세요 (1) Equal (2) Not Equal (3) NullPointerException : ");
        int answer1 = scanner.nextInt();
        if (answer1 == 3) {
            System.out.println("정답! null 객체의 메소드를 호출하려고 하면 NullPointerException이 발생합니다.");
        } else {
            System.out.println("오답! null 객체의 메소드를 호출하려고 하면 NullPointerException이 발생합니다. " +
                    "이를 방지하려면 'Hello'.equals(str)와 같이 작성하거나, str != null 체크를 먼저 해야 합니다.");
        }

        // 추가 문제들...

        System.out.println("\nNull Pointer 예외 퀴즈를 완료했습니다!");
    }
}