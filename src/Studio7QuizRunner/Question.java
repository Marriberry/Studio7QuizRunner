package Studio7QuizRunner;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private String correctAnswer;
    private Integer pointValue;
    private Boolean correct;

    public Question (String question, String correctAnswer, Integer pointValue){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }

    public String askQuestion() {
        return "I asked.";
    }

    public void getUserAnswer() {

    }

    public String gradeQuestion() {
        return "I graded your question.";
    }

}