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

public class JsActivity extends AppCompatActivity {

    Button jsModule, practiceJS;
    ImageView homeImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.js);

        jsModule = findViewById(R.id.jsModule);
        practiceJS = findViewById(R.id.practiceJS);
        homeImgView = findViewById(R.id.homeImgView);

        jsModule.setOnClickListener(view ->{
            Intent intent = new Intent(JsActivity.this, JsModuleActivity.class);
            startActivity(intent);
        });

        practiceJS.setOnClickListener(view ->{
            Intent intent = new Intent(JsActivity.this, JsPracticeActivity.class);
            startActivity(intent);
        });

        homeImgView.setOnClickListener(view ->{
            Intent intent = new Intent(JsActivity.this,  MainActivity.class);
            startActivity(intent);
        });


    }
}