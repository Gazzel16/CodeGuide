package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class HtmlPracticeActivity extends AppCompatActivity {

    private Button question1btn1, question1btn2, btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.html_practice);

        // Initialize buttons with findViewById
        question1btn1 = findViewById(R.id.question1btn1);
        question1btn2 = findViewById(R.id.question1btn2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(view ->{
            Intent intent = new Intent(HtmlPracticeActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // Set up OnClickListener for the correct answer button
        question1btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog("Congratulations!", "You got the answer right!");
            }
        });

        // Set up OnClickListener for the incorrect answer button
        question1btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog("Result:", "Wrong answer! try again");
            }
        });
    }

    private void showCustomDialog(String title, String message) {
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_custom, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(HtmlPracticeActivity.this);
        builder.setView(dialogView);

        AlertDialog alertDialog = builder.create();

        // Access elements within the custom layout
        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        TextView dialogMessage = dialogView.findViewById(R.id.dialogMessage);
        Button closeButton = dialogView.findViewById(R.id.closeButton);

        // Set dialog title and message
        dialogTitle.setText(title);
        dialogMessage.setText(message);

        // Close the dialog on button click
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
}
