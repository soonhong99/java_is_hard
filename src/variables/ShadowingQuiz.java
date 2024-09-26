package variables;

import java.util.Scanner;

public class ShadowingQuiz {

    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 변수 Shadowing 퀴즈 ===");

        // 문제 1
        System.out.println("\n문제 1: 다음 코드에서 출력 결과는?");
        System.out.println("""
            public class Example {
                int x = 5;  // 인스턴스 변수

                public void printX() {
                    int x = 10;  // 지역 변수 
                    System.out.println(x);
                }

                public static void main(String[] args) {
                    Example example = new Example();
                    example.printX();
                }
            }
        """);

        System.out.print("정답을 입력하세요 (1) 5, (2) 10, (3) 에러 발생: ");
        int answer1 = scanner.nextInt();

        if (answer1 == 2) {
            System.out.println("정답! 지역 변수 x가 인스턴스 변수 x를 가리기 때문에 해당 블록에서는 지역 변수 값이 출력됩니다.");
        } else {
            System.out.println("오답! 지역 변수 x가 인스턴스 변수 x를 가리기 때문에 출력되는 값은 지역 변수 값인 10입니다.");
        }

        // 문제 2
        System.out.println("\n문제 2: first x, second x의 출력값으로 옳은 것을 고르시오");
        System.out.println("""
            public class ShadowingExample {
                        int x = 5;  // 인스턴스 변수
                    
                        public void setX(int x) {  
                            this.x = x;  
                            System.out.println("first x: " + x);  
                            System.out.println("second x: " + this.x);  
                        }
                    
                        public static void main(String[] args) {
                            ShadowingExample example = new ShadowingExample();
                            example.setX(10);
                        }
                    }
                
        """);

        System.out.print("정답을 입력하세요 (1) first x: 10, second x: 10, (2) first x: 10, second x: 5, (3) 에러 발생: ");
        int answer2 = scanner.nextInt();

        if (answer2 == 1) {
            System.out.println("정답! 인스턴스 변수 x가 지역 변수의 값을 참조하게 되었기 때문에 second의 값도 10으로 변경됩니다.");
        } else {
            System.out.println("오답! 인스턴스 변수 x가 10으로 업데이트되었기 때문에 출력되는 값은 10입니다.");
        }

        System.out.println("\n퀴즈를 완료했습니다! 변수 shadowing에 대해 더 잘 이해하셨길 바랍니다.");
    }
}
