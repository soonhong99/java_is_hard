package managers;

import java.util.Scanner;

public class MainQuizManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueQuiz = true;

        while (continueQuiz) {
            System.out.println("=== 자바 개념 복습 시스템 ===");

            // 대단원 선택
            System.out.println("복습할 대단원을 선택하세요:");
            System.out.println("1. 변수\n2. 연산자\n3. 형변환\n4. 프로그램을 종료하고 싶습니다");
            int majorChoice = scanner.nextInt();

            QuizManager manager = null;

            // 선택에 따라 각 대단원 관리자를 생성
            switch (majorChoice) {
                case 1:
                    manager = new VariableManager();
                    break;
                case 2:
                    manager = new OperatorManager();
                    break;
                case 3:
                    manager = new TypeCastingManager();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    continueQuiz = false;
                    continue;
                default:
                    System.out.println("잘못된 선택입니다.");
                    continue;
            }

            if (manager != null) {
                // 세부 주제 선택 및 처리
                manager.displayTopics();
                int topicChoice = scanner.nextInt();
                manager.handleTopicSelection(topicChoice);
            }

            // 퀴즈를 더 풀지 여부 확인
            System.out.println("다른 문제를 풀겠습니까? (1) 예 (2) 아니오");
            int continueChoice = scanner.nextInt();
            if (continueChoice != 1) {
                continueQuiz = false;
                System.out.println("프로그램을 종료합니다.");
            }
        }

        scanner.close();
    }
}
