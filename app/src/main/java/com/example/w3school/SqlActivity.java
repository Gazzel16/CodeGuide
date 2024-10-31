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

public class SqlActivity extends AppCompatActivity {
    Button practiceSQL, sqlModule;
    ImageView homeImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.sql);

        practiceSQL = findViewById(R.id.practiceSQL);
        sqlModule = findViewById(R.id.sqlModule);
        homeImgView = findViewById(R.id.homeImgView);

        practiceSQL.setOnClickListener(view ->{
            Intent intent = new Intent(SqlActivity.this, SqlPracticeActivity.class);
            startActivity(intent);
        });

        sqlModule.setOnClickListener(view ->{
            Intent intent = new Intent(SqlActivity.this, SqlModuleActivity.class);
            startActivity(intent);
        });

        homeImgView.setOnClickListener(view ->{
            Intent intent = new Intent(SqlActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}