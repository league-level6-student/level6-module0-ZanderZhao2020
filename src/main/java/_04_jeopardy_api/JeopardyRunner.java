package _04_jeopardy_api;

import _04_jeopardy_api.data_transfer_objects.Clue;

import javax.swing.*;

public class JeopardyRunner {

    public static void main(String[] args) {

        JeopardyApi jeopardyApi = new JeopardyApi();

        //1. Create a score variable
        int Score = 0;
        //2. Add a for loop where:
        //i starts at 100,
        //continues while i <= 1000
        //increments by 100
        JeopardyApi API = new JeopardyApi();
        String Question, Answer, Title;
        for (int I = 100; I <= 1000; I += 100) {
        	if (I == 700 || I == 900) {
        		continue;
        	}
            //3. If i == 700 or i == 900, continue;
            //there are no questions for these values
        	Clue Clue = API.getClue(I);
            //4. Call the getClue() method with i
        	Question = Clue.getQuestion();
            //5. Save the question in a String variable
        	Answer = Clue.getAnswer();
            //6. Save the answer in a String variable
        	Title = Clue.getCategory().getTitle();
            //7. Save the title in a String variable
            //note that this is part of the Category object
        	if (JOptionPane.showInputDialog(Title + ": " + Question + "(" + Answer + ")").equals(Answer)) {
        		JOptionPane.showMessageDialog(null, "Correct");
        		Score += Clue.getValue();
        	} else {
        		JOptionPane.showMessageDialog(null, "Wrong lol what an idiot");
        	}
            //8. Use a JOptionPane to display the question.
            //You can set the title of the JOptionPane to the question title.

            //9. If they got the question correct, add the value of that question to their score
        }
        //10. Tell the user their final score
        JOptionPane.showMessageDialog(null, "Your score is " + Score);
    }

}
