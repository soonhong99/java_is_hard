package typecasting;

import java.util.Scanner;

public class PrecisionLossQuiz {
    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 정밀도 손실 퀴즈 ===");

        // 문제 1: int에서 float으로 변환 시 정밀도 손실
        System.out.println("\n문제 1: 다음 코드의 출력 결과는?");
        System.out.println("""
        int largeInt = 123456789;
        float f = largeInt;
        System.out.println(f == largeInt);
        """);
        System.out.print("정답을 입력하세요 (true/false): ");
        boolean answer1 = scanner.nextBoolean();
        if (!answer1) {
            System.out.println("정답! float은 약 6-7자리의 정밀도를 가지므로, 큰 int 값을 정확히 표현하지 못할 수 있습니다.");
        } else {
            System.out.println("오답! float은 약 6-7자리의 정밀도를 가지므로, 큰 int 값을 정확히 표현하지 못할 수 있습니다. 결과는 false입니다.");
        }

        // 문제 2: double에서 float으로 변환 시 정밀도 손실
        System.out.println("\n문제 2: 다음 코드의 출력 결과는?");
        System.out.println("""
        double d = 0.1;
        float f = (float) d;
        System.out.println(f == 0.1);
        """);
        System.out.print("정답을 입력하세요 (true/false): ");
        boolean answer2 = scanner.nextBoolean();
        if (!answer2) {
            System.out.println("정답! 0.1은 이진 부동소수점으로 정확히 표현할 수 없으며, float으로 변환 시 추가적인 정밀도 손실이 발생합니다.");
        } else {
            System.out.println("오답! 0.1은 이진 부동소수점으로 정확히 표현할 수 없으며, float으로 변환 시 추가적인 정밀도 손실이 발생합니다. 결과는 false입니다.");
        }

        // 문제 3: long에서 float으로 변환 시 정밀도 손실
        System.out.println("\n문제 3: 다음 코드의 출력 결과는?");
        System.out.println("""
        long l = 9223372036854775807L;  // Long.MAX_VALUE
        float f = l;
        System.out.println(f);
        """);
        System.out.print("정답을 입력하세요 (9.223372E18 형식으로): ");
        float answer3 = scanner.nextFloat();
        if (Math.abs(answer3 - 9.223372E18f) < 1E12) {
            System.out.println("정답! long의 최대값이 float으로 변환되면 정밀도 손실로 인해 근사값으로 표현됩니다.");
        } else {
            System.out.println("오답! long의 최대값이 float으로 변환되면 정밀도 손실로 인해 9.223372E18의 근사값으로 표현됩니다.");
        }

        // 문제 4: 작은 수와 큰 수의 덧셈에서의 정밀도 손실
        System.out.println("\n문제 4: 다음 코드의 출력 결과는?");
        System.out.println("""
        double small = 0.1;
        double large = 1e17;
        double result = (large + small) - large;
        System.out.println(result);
        """);
        System.out.print("정답을 입력하세요: ");
        double answer4 = scanner.nextDouble();
        if (answer4 == 0.0) {
            System.out.println("정답! 매우 큰 수에 작은 수를 더할 때, 작은 수의 정밀도가 완전히 손실될 수 있습니다.");
        } else {
            System.out.println("오답! 매우 큰 수에 작은 수를 더할 때, 작은 수의 정밀도가 완전히 손실되어 결과는 0.0이 됩니다.");
        }

        // 문제 5: 반복적인 연산에서의 정밀도 손실 누적
        System.out.println("\n문제 5: 다음 코드의 출력 결과는?");
        System.out.println("""
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println(sum == 1.0);
        """);
        System.out.print("정답을 입력하세요 (true/false): ");
        boolean answer5 = scanner.nextBoolean();
        if (!answer5) {
            System.out.println("정답! 부동소수점 연산의 작은 오차가 누적되어, 예상과 다른 결과가 나올 수 있습니다.");
        } else {
            System.out.println("오답! 부동소수점 연산의 작은 오차가 누적되어, sum은 정확히 1.0이 되지 않습니다. 결과는 false입니다.");
        }

        System.out.println("\n정밀도 손실 퀴즈를 완료했습니다!");
    }
}