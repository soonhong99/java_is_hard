package managers;

import variables.ScopeQuiz;
import variables.StaticLocalQuiz;

public class VariableManager implements QuizManager {

    @Override
    public void displayTopics() {
        System.out.println("변수 패키지를 선택했습니다. 세부 주제를 선택하세요:");
        System.out.println("1. 스코프(Scope)\n2. 변수 선언 및 초기화");
    }

    @Override
    public void handleTopicSelection(int topicChoice) {
        switch (topicChoice) {
            case 1:
                ScopeQuiz.startQuiz();
                break;
            case 2:
                StaticLocalQuiz.startQuiz();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }
}
