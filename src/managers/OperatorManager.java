package managers;

public class OperatorManager implements QuizManager {

    @Override
    public void displayTopics() {
        System.out.println("연산자 패키지를 선택했습니다. 세부 주제를 선택하세요:");
        // 향후 연산자 관련 주제 추가 예정
        System.out.println("1. 연산자 문제 (준비 중)");
    }

    @Override
    public void handleTopicSelection(int topicChoice) {
        System.out.println("연산자 문제는 아직 준비 중입니다.");
    }
}
