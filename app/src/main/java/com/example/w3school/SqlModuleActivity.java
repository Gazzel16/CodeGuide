package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SqlModuleActivity extends AppCompatActivity {

    Button practiceSQLBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sql_module);

        practiceSQLBtn = findViewById(R.id.practiceSQLBtn);

        practiceSQLBtn.setOnClickListener(view ->{
            Intent intent = new Intent(SqlModuleActivity.this, SqlPracticeActivity.class);
            startActivity(intent);
        });
    }
}