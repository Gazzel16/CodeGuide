package com.example.w3school;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CssActivity extends AppCompatActivity {

    Button practiceCSS, cssModule;
    ImageView homeImgView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.css);

        practiceCSS = findViewById(R.id.practiceCSS);
        cssModule = findViewById(R.id.cssModule);

        homeImgView = findViewById(R.id.homeImgView);


        practiceCSS.setOnClickListener(view ->{
            Intent intent = new Intent(CssActivity.this, CssPracticeActivity.class);
            startActivity(intent);
        });

        cssModule .setOnClickListener(view -> {
            Intent intent = new Intent(CssActivity.this, CssModuleActivity.class);
            startActivity(intent);
        });

        homeImgView.setOnClickListener(view ->{
            Intent intent = new Intent(CssActivity.this, MainActivity.class);
            startActivity(intent);
        });


    }
}