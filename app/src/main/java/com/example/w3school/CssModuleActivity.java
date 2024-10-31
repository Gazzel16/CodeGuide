package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CssModuleActivity extends AppCompatActivity {
    Button practiceCSSbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.css_module);

        practiceCSSbtn = findViewById(R.id.practiceCSSbtn);

        practiceCSSbtn.setOnClickListener(view ->{
            Intent intent = new Intent(CssModuleActivity.this, CssPracticeActivity.class);
            startActivity(intent);
        });

    }
}