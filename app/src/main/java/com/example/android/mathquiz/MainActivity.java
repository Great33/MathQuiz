package com.example.android.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*this method creates the objects for the radio buttons,edit text and check boxes and
     * assigns them to a boolean variable to see if they are checked
     * and dispays the total correct answer when the submit button is clicked*/
    public void onSubmitButtonClick(View view) {
        RadioButton question1option2 = (RadioButton) findViewById(R.id.question1option2);
        boolean question1option2Correct = question1option2.isChecked();
        CheckBox question2option1 = (CheckBox) findViewById(R.id.question2option1);
        boolean question2option1Correct = question2option1.isChecked();
        CheckBox question2option2 = (CheckBox) findViewById(R.id.question2option2);
        boolean question2option2Correct = question2option2.isChecked();
        CheckBox question2option3 = (CheckBox) findViewById(R.id.question2option3);
        boolean question2option3Correct = question2option3.isChecked();
        CheckBox question2option4 = (CheckBox) findViewById(R.id.question2option4);
        boolean question2option4Correct = question2option4.isChecked();
        CheckBox question3option1 = (CheckBox) findViewById(R.id.question3option1);
        boolean question3option1Correct = question3option1.isChecked();
        CheckBox question3option2 = (CheckBox) findViewById(R.id.question3option2);
        boolean question3option2Correct = question3option2.isChecked();
        CheckBox question3option3 = (CheckBox) findViewById(R.id.question3option3);
        boolean question3option3Correct = question3option3.isChecked();
        CheckBox question3option4 = (CheckBox) findViewById(R.id.question3option4);
        boolean question3option4Correct = question3option4.isChecked();
        CheckBox question3option5 = (CheckBox) findViewById(R.id.question3option5);
        boolean question3option5Correct = question3option5.isChecked();
        CheckBox question3option6 = (CheckBox) findViewById(R.id.question3option6);
        boolean question3option6Correct = question3option6.isChecked();
        RadioButton question4option1 = (RadioButton) findViewById(R.id.question4option1);
        boolean question4option1Correct = question4option1.isChecked();
        /*this creates the text field for question 5 and checks if the answer is equal to
         * 12 which is the correct answer*/
        EditText question5answer = (EditText) findViewById(R.id.question5answer);
        String question5 = question5answer.getText().toString();
        boolean question5correct = question5.equals("12");
        RadioButton question6option3 = (RadioButton) findViewById(R.id.question6option3);
        boolean question6option3Correct = question6option3.isChecked();
        RadioButton question7option2 = (RadioButton) findViewById(R.id.question7option2);
        boolean question7option2Correct = question7option2.isChecked();
        RadioButton question8option1 = (RadioButton) findViewById(R.id.question8option1);
        boolean question8option1Correct = question8option1.isChecked();
        RadioButton question9option4 = (RadioButton) findViewById(R.id.question9option4);
        boolean question9option4Correct = question9option4.isChecked();
        RadioButton question10option2 = (RadioButton) findViewById(R.id.question10option2);
        boolean question10option2Correct = question10option2.isChecked();
        //this method calls the calculateScore method and assigns it to an integer variable score
        int score = calculateScore(question1option2Correct, question2option1Correct, question2option2Correct,
                question2option3Correct, question2option4Correct, question3option1Correct,
                question3option2Correct, question3option3Correct, question3option4Correct, question3option5Correct,
                question3option6Correct, question4option1Correct, question5correct, question6option3Correct,
                question7option2Correct, question8option1Correct, question9option4Correct, question10option2Correct);
        //this creates the messages to be displayed in the Toast
        String scoreMessage = getString(R.string.scoreMessage, score);
        String allCorrect = getString(R.string.allCorrect);
        String noneCorrect = getString(R.string.noneCorrect);
        //this creates the conditions to which message is displayed in the Toast
        if (score == 10) {
            Toast.makeText(this, allCorrect, Toast.LENGTH_LONG).show();
        } else if (score == 0) {
            Toast.makeText(this, noneCorrect, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
        }

    }

    //this method calculates the total score
    public int calculateScore(boolean option2Correct, boolean option21Correct, boolean option22Correct,
                              boolean option23Correct, boolean option24Correct, boolean option31Correct, boolean option32Correct,
                              boolean option33Correct, boolean option34Correct, boolean option35Correct, boolean option36Correct,
                              boolean option41Correct, boolean question5ans, boolean option63Correct, boolean option72Correct,
                              boolean option81Correct, boolean option94Correct, boolean option102Correct) {

        int totalScore = 0;
        if (option2Correct) {
            totalScore += 1;
        }
        if (option22Correct && option24Correct && !option21Correct && !option23Correct) {
            totalScore += 1;
        }
        if (!option31Correct && !option32Correct && option33Correct && option34Correct && option35Correct && option36Correct) {
            totalScore += 1;
        }

        if (option41Correct) {
            totalScore += 1;
        }
        if (question5ans) {
            totalScore += 1;
        }
        if (option63Correct) {
            totalScore += 1;
        }
        if (option72Correct) {
            totalScore += 1;
        }
        if (option81Correct) {
            totalScore += 1;
        }
        if (option94Correct) {
            totalScore += 1;
        }
        if (option102Correct) {
            totalScore += 1;
        }
        return totalScore;
    }
}
