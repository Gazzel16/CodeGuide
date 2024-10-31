package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PythonActivity extends AppCompatActivity {
Button pythonModule,practicePython;
ImageView homeImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.python);

        pythonModule = findViewById(R.id.pythonModule);
        practicePython = findViewById(R.id.practicePython);
        homeImgView = findViewById(R.id.homeImgView);

        pythonModule.setOnClickListener(view ->{
            Intent intent = new Intent(PythonActivity.this, PythonModuleActivity.class);
            startActivity(intent);
        });

        practicePython.setOnClickListener(view ->{
            Intent intent = new Intent(PythonActivity.this, PythonPracticeActivity.class);
            startActivity(intent);
        });

        homeImgView.setOnClickListener(view ->{
            Intent intent = new Intent(PythonActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}