package Studio7QuizRunner;


import java.util.ArrayList;

public class MultipleChoice extends Question{

    private ArrayList<String> answerOptions;

    public MultipleChoice(String question, String correctAnswer, Integer pointValue, ArrayList<String> answerOptions) {
        super(question, correctAnswer, pointValue);
        this.answerOptions = answerOptions;
    }
}