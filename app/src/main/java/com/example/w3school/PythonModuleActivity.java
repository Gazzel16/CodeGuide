package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PythonModuleActivity extends AppCompatActivity {

    Button practicePythonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.python_module);

        practicePythonBtn = findViewById(R.id.practicePythonBtn);

        practicePythonBtn.setOnClickListener(view ->{
            Intent intent = new Intent(PythonModuleActivity.this, PythonPracticeActivity.class);
            startActivity(intent);
        });
    }
}