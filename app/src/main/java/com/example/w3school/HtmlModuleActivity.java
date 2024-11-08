package com.example.w3school;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HtmlModuleActivity extends AppCompatActivity {

    Button practiceHTMLbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.html_module);

        practiceHTMLbtn = findViewById(R.id.practiceHTMLbtn);

        practiceHTMLbtn.setOnClickListener(view ->{
            Intent intent = new Intent(HtmlModuleActivity.this, HtmlPracticeActivity.class);
            startActivity(intent);
        });

    }
}