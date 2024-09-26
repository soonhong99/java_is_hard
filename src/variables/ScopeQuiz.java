package variables;

import java.util.Scanner;

public class ScopeQuiz {

    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 스코프 퀴즈 ===");

        // 문제 1
        System.out.println("\n문제 1: 다음 코드에서 y의 값은?");
        System.out.println("""
            public class Example {
                public static void main(String[] args) {
                    int x = 10;
                    if (x > 5) {
                        int y = 20;
                    }
                    System.out.println(y);   y는 어디서 선언되었나요?
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) 10, (2) 20, (3) 에러 발생 : ");
        int answer1 = scanner.nextInt();

        if (answer1 == 3) {
            System.out.println("정답! y는 if 블록 안에서만 유효하므로 블록 밖에서 사용하면 에러가 발생합니다.");
        } else {
            System.out.println("오답! y는 if 블록을 벗어나면 사용할 수 없기 때문에 에러가 발생합니다.");
        }

        // 문제 2
        System.out.println("\n문제 2: 같은 스코프에서 변수 이름을 두 번 선언할 수 있나요?");
        System.out.println("""
            public class Example {
                public static void main(String[] args) {
                    int x = 10;
                    int x = 20;   이 코드는 어떻게 될까요?
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) 가능, (2) 불가능 : ");
        int answer2 = scanner.nextInt();

        if (answer2 == 2) {
            System.out.println("정답! 같은 스코프에서 변수 이름을 두 번 선언할 수 없습니다.");
        } else {
            System.out.println("오답! 같은 스코프에서 같은 이름의 변수를 선언하면 컴파일 에러가 발생합니다.");
        }

        // 문제 3
        System.out.println("\n문제 3: 다른 스코프에서는 같은 이름의 변수를 선언할 수 있나요?");
        System.out.println("""
            public class Example {
                public static void main(String[] args) {
                    int x = 10;
                    if (x > 5) {
                        int x = 20;   이 코드는 어떻게 될까요?
                    }
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) 가능, (2) 불가능 : ");
        int answer3 = scanner.nextInt();

        if (answer3 == 1) {
            System.out.println("정답! 다른 스코프(블록)에서는 같은 이름의 변수를 선언할 수 있습니다.");
        } else {
            System.out.println("오답! 다른 스코프에서는 같은 이름의 변수를 선언할 수 있습니다.");
        }

        System.out.println("\n퀴즈를 완료했습니다! 스코프에 대해 더 잘 이해하셨길 바랍니다.");

    }
}
