package managers;

import operators.BasicOperatorQuiz;
import operators.FloatingPointQuiz;
import operators.NullPointerQuiz;

public class OperatorManager implements QuizManager {
    @Override
    public void displayTopics() {
        System.out.println("연산자 패키지를 선택했습니다. 세부 주제를 선택하세요:");
        System.out.println("1. 기본 연산자\n2. Null Pointer 예외\n3. 부동소수점 연산");
    }

    @Override
    public void handleTopicSelection(int topicChoice) {
        switch (topicChoice) {
            case 1:
                BasicOperatorQuiz.startQuiz();
            case 2:
                NullPointerQuiz.startQuiz();
            case 3:
                FloatingPointQuiz.startQuiz();
                break;
            default:
                // System.out.println("잘못된 선택입니다.");
                break;
        }
    }
}