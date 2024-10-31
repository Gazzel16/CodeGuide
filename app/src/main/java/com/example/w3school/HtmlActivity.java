package com.example.w3school;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HtmlActivity extends AppCompatActivity {

    Button practiceHTML, htmlModule;
    ImageView homeImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.html);

        practiceHTML = findViewById(R.id.practiceHTML);
        htmlModule = findViewById(R.id.htmlModule);

        homeImgView = findViewById(R.id.homeImgView);


        practiceHTML.setOnClickListener(view ->{
            Intent intent = new Intent(HtmlActivity.this, HtmlPracticeActivity.class);
            startActivity(intent);
        });

        htmlModule.setOnClickListener(view -> {
            Intent intent = new Intent(HtmlActivity.this, HtmlModuleActivity.class);
            startActivity(intent);
        });

        homeImgView.setOnClickListener(view ->{
            Intent intent = new Intent(HtmlActivity.this, MainActivity.class);
            startActivity(intent);
        });



    }
}