package managers;

import typecasting.ImplicitCastingQuiz;
import typecasting.ExplicitCastingQuiz;
import typecasting.NumericPromotionQuiz;
import typecasting.PrecisionLossQuiz;

public class TypeCastingManager implements QuizManager {
    @Override
    public void displayTopics() {
        System.out.println("형변환 패키지를 선택했습니다. 세부 주제를 선택하세요:");
        System.out.println("1. 자동 형변환 (Implicit Casting)");
        System.out.println("2. 명시적 형변환 (Explicit Casting)");
        System.out.println("3. 숫자형 승격 (Numeric Promotion)");
        System.out.println("4. 정밀도 손실 (Precision Loss)");
    }

    @Override
    public void handleTopicSelection(int topicChoice) {
        switch (topicChoice) {
            case 1:
                ImplicitCastingQuiz.startQuiz();
                break;
            case 2:
                ExplicitCastingQuiz.startQuiz();
                break;
            case 3:
                NumericPromotionQuiz.startQuiz();
                break;
            case 4:
                PrecisionLossQuiz.startQuiz();
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }
}