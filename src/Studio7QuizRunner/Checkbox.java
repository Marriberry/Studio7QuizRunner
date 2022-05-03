package Studio7QuizRunner;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> answerOptions;

    public Checkbox(String question, String correctAnswer, Integer pointValue, ArrayList<String> answerOptions) {
        super(question, correctAnswer, pointValue);
        this.answerOptions = answerOptions;
    }
}