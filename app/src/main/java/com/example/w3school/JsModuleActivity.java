package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JsModuleActivity extends AppCompatActivity {

    Button practiceJSbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.js_module);

        practiceJSbtn = findViewById(R.id.practiceJSbtn);

        practiceJSbtn.setOnClickListener(view ->{
            Intent intent = new Intent(JsModuleActivity.this, JsPracticeActivity.class);
            startActivity(intent);
        });

    }
}