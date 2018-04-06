package com.example.dharun.project;


public class Questions {

    public String mQuestions[] = {
            "What is 1 x 5?",
            "What is 2 x 5?",
            "What is 3 x 5?",
            "What is 4 x 5?",
            "What is 5 x 5?",
            "What is 6 x 5?",
            "What is 7 x 5?",
            "What is 8 x 5?",
            "What is 9 x 5?"
    };

    private String mChoices[][] = {
            {"1", "5", "10", "20"},
            {"1", "5", "10", "20"},
            {"15", "5", "10", "20"},
            {"1", "20", "10", "20"},
            {"1", "5", "10", "25"},
            {"30", "5", "10", "20"},
            {"1", "35", "10", "20"},
            {"1", "5", "10", "40"},
            {"1", "45", "10", "20"}
    };

    private String mCorrectAnswers[] = {"5", "10", "15", "20", "25", "30", "35", "40", "45"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
