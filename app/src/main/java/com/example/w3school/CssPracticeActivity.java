package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CssPracticeActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.css_practice);

     btn = findViewById(R.id.btn);

     btn.setOnClickListener(view ->{
         Intent intent = new Intent(CssPracticeActivity.this, MainActivity.class);
         startActivity(intent);
     });
    }
}