package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    EditText nameField, emailField, passwordField;
    Button signupButton;
    TextView loginLink;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        // Initialize Views
        nameField = findViewById(R.id.name);
        emailField = findViewById(R.id.email);
        passwordField = findViewById(R.id.password);
        signupButton = findViewById(R.id.signupBtn);
        loginLink = findViewById(R.id.loginBtn);

        // Initialize Database Helper
        dbHelper = new DBHelper(this);

        // Handle Signup Button Click
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(signup.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else if (dbHelper.checkUserExists(email)) {
                    Toast.makeText(signup.this, "User already exists", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInserted = dbHelper.insertUser(name, email, password);
                    if (isInserted) {
                        Toast.makeText(signup.this, "Signup Successful", Toast.LENGTH_SHORT).show();
                        // Navigate to login or home screen
                        Intent intent = new Intent(signup.this, login.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(signup.this, "Signup Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        // Handle Login Link Click
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
}
