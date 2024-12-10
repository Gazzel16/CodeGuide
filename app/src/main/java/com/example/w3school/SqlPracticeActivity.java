package com.example.w3school;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SqlPracticeActivity extends AppCompatActivity {

    private Button submitBtn;
    private int score = 0;

    // Track selected buttons for each CardView
    private Button selectedButton1 = null;
    private Button selectedButton2 = null;
    private Button selectedButton3 = null;
    private Button selectedButton4 = null;
    private Button selectedButton5 = null;

    // Track selected answers
    private String answer1 = "", answer2 = "", answer3 = "", answer4 = "", answer5 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sql_practice);  // Use your XML layout file here

        submitBtn = findViewById(R.id.submitbtn);

        // Initialize and set click listeners for answer buttons
        findViewById(R.id.question1btn1).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question1btn2).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question2btn1).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question2btn2).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question3btn1).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question3btn2).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question4btn1).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question4btn2).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question5btn1).setOnClickListener(this::onAnswerSelected);
        findViewById(R.id.question5btn2).setOnClickListener(this::onAnswerSelected);

         Button btn = findViewById(R.id.btn);

         btn.setOnClickListener(view ->{
             Intent intent = new Intent(this, MainActivity.class);
             startActivity(intent);
         });



        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateScore();
                showResultDialog();
                resetActivity();  // Reset after submission
            }
        });
    }

    public void onAnswerSelected(View view) {
        Button clickedButton = (Button) view;

        // Determine which question this button belongs to using if-else
        if (clickedButton.getId() == R.id.question1btn1 || clickedButton.getId() == R.id.question1btn2) {
            resetPreviousButton(selectedButton1);
            selectedButton1 = clickedButton;
            answer1 = clickedButton.getText().toString();
        } else if (clickedButton.getId() == R.id.question2btn1 || clickedButton.getId() == R.id.question2btn2) {
            resetPreviousButton(selectedButton2);
            selectedButton2 = clickedButton;
            answer2 = clickedButton.getText().toString();
        } else if (clickedButton.getId() == R.id.question3btn1 || clickedButton.getId() == R.id.question3btn2) {
            resetPreviousButton(selectedButton3);
            selectedButton3 = clickedButton;
            answer3 = clickedButton.getText().toString();
        } else if (clickedButton.getId() == R.id.question4btn1 || clickedButton.getId() == R.id.question4btn2) {
            resetPreviousButton(selectedButton4);
            selectedButton4 = clickedButton;
            answer4 = clickedButton.getText().toString();
        } else if (clickedButton.getId() == R.id.question5btn1 || clickedButton.getId() == R.id.question5btn2) {
            resetPreviousButton(selectedButton5);
            selectedButton5 = clickedButton;
            answer5 = clickedButton.getText().toString();
        }

        // Highlight the clicked button
        clickedButton.setBackgroundColor(Color.GREEN);
    }

    private void resetPreviousButton(Button previousButton) {
        if (previousButton != null) {
            previousButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray)); // Reset to default color
        }
    }

    private void calculateScore() {
        score = 0;
        // Check answers and increment score
        if (answer1.equals("Structured Query Language")) score++;
        if (answer2.equals("CREATE")) score++;
        if (answer3.equals("SELECT")) score++;
        if (answer4.equals("Data Manipulation Language")) score++;
        if (answer5.equals("DROP")) score++;
    }

    private void showResultDialog() {
        StringBuilder resultMessage = new StringBuilder();
        resultMessage.append("Your score: ").append(score).append("/5\n\n");
        resultMessage.append("Correct Answers:\n");
        resultMessage.append("1. Structured Query Language\n");
        resultMessage.append("2. CREATE\n");
        resultMessage.append("3. SELECT\n");
        resultMessage.append("4. Data Manipulation Language\n");
        resultMessage.append("5. DROP");

        new AlertDialog.Builder(this)
                .setTitle("Quiz Results")
                .setMessage(resultMessage.toString())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }


    private void resetActivity() {
        // Reset buttons' background colors using if-else
        if (selectedButton1 != null) selectedButton1.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        if (selectedButton2 != null) selectedButton2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        if (selectedButton3 != null) selectedButton3.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        if (selectedButton4 != null) selectedButton4.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        if (selectedButton5 != null) selectedButton5.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

        // Reset selected answers using if-else
        if (!answer1.isEmpty()) answer1 = "";
        if (!answer2.isEmpty()) answer2 = "";
        if (!answer3.isEmpty()) answer3 = "";
        if (!answer4.isEmpty()) answer4 = "";
        if (!answer5.isEmpty()) answer5 = "";

        // Optionally reset the score
        score = 0;
    }
}
