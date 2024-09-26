package variables;

import java.util.Scanner;

public class StaticLocalQuiz {

    public static void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== static 변수와 지역 변수 퀴즈 ===");

        // 문제 1
        System.out.println("\n문제 1: 다음 코드에서 local 변수와 static 변수의 최종 결과값을 예측하라");
        System.out.println("""
            public class Example {
                static int staticVar = 0; // static 변수

                public void myMethod() {
                    int localVar = 10; // 지역 변수
                    System.out.println("localVar: " + localVar);
                    staticVar++;
                    System.out.println("staticVar: " + staticVar);
                }

                public static void main(String[] args) {
                    Example obj1 = new Example();
                    Example obj2 = new Example();
                    obj1.myMethod();
                    obj2.myMethod();
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) staticVar: 12 localVar: 10, (2) staticVar: 10, localVar: 10");
        int answer1 = scanner.nextInt();

        if (answer1 == 2) {
            System.out.println("정답! staticVar는 클래스 단위로 공유되며, localVar는 메서드 호출마다 새로 생성됩니다.");
        } else {
            System.out.println("오답! localVar는 지역 변수로서 각 메서드 호출마다 생성되고, staticVar는 모든 객체가 공유합니다.");
        }

        // 문제 2
        System.out.println("\n문제 2: static 변수의 수명과 지역 변수의 수명 차이를 설명할 수 있는 예제는?");
        System.out.println("""
            public class Example {
                static int staticVar = 0;

                public void increaseStaticVar() {
                    staticVar++;
                }

                public void localVariableMethod() {
                    int localVar = 0;
                    localVar++;
                }

                public static void main(String[] args) {
                    Example obj1 = new Example();
                    obj1.increaseStaticVar();
                    obj1.localVariableMethod();
                    obj1.localVariableMethod();
                    System.out.println("staticVar: " + staticVar);
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) staticVar는 계속 증가하지만, localVar는 메서드 호출마다 새로 초기화된다, (2) 둘 다 호출될 때마다 초기화된다: ");
        int answer2 = scanner.nextInt();

        if (answer2 == 1) {
            System.out.println("정답! static 변수는 객체가 공유하여 계속 증가하지만, 지역 변수는 메서드가 호출될 때마다 다시 초기화됩니다.");
        } else {
            System.out.println("오답! static 변수는 초기화되지 않지만, 지역 변수는 호출마다 다시 0으로 초기화됩니다.");
        }

        // 문제 3
        System.out.println("\n문제 3: static 변수가 아닌 instance 변수와 지역 변수의 최종 결과값을 예측하라");
        System.out.println("""
            public class Example {
                int instanceVar = 5; // 인스턴스 변수
                
                public void myMethod() {
                    int localVar = 10; // 지역 변수
                    instanceVar++;
                    localVar++;
                    System.out.println("instanceVar: " + instanceVar);
                    System.out.println("localVar: " + localVar);
                }
                
                public static void main(String[] args) {
                    Example example1 = new Example();
                    example1.myMethod();
                    Example example2 = new Example();
                    example2.myMethod();
                }
            }
        """);
        System.out.print("정답을 입력하세요 (1) instanceVar: 6 localVar: 11, (2) instanceVar: 7, localVar: 11 ");
        int answer3 = scanner.nextInt();

        if (answer3 == 1) {
            System.out.println("정답! instance 변수는 각 객체마다 독립적으로 존재하여 여러 객체 생성시 서로의 값을 공유하지 않는다.");
        } else {
            System.out.println("오답! instance 변수는 각 객체에 존재하며, 메서드 호출마다 새로 초기화되지 않습니다.");
        }

        System.out.println("\n퀴즈를 완료했습니다! static 변수와 지역 변수의 차이를 더 잘 이해하셨길 바랍니다.");
    }
}
