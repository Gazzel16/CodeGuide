package com.example.w3school;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageView by ID
        ImageView menuImageView = findViewById(R.id.imageView8);

        if (menuImageView != null) {
            // Set a click listener to show the popup menu
            menuImageView.setOnClickListener(view -> {
                // Create a PopupMenu instance
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                // Inflate the menu resource
                popup.getMenuInflater().inflate(R.menu.dropdown_menu, popup.getMenu());

                // Handle menu item clicks
                popup.setOnMenuItemClickListener(this::handleMenuClick);
                // Show the popup menu
                popup.show();
            });
        }

        // Setup click listeners for images inside CardViews
        setupCardViewImageClickListeners();
    }

    // Method to handle menu item clicks in the popup menu
    private boolean handleMenuClick(MenuItem item) {
        int itemId = item.getItemId();
        Intent intent;

        if (itemId == R.id.logout){
            intent = new Intent (this, login.class);
            startActivity(intent);
        }

        if (itemId == R.id.menu_html) {
            intent = new Intent(this, HtmlActivity.class);
            startActivity(intent);
        } else if (itemId == R.id.menu_css) {
            intent = new Intent(this, CssActivity.class);
            startActivity(intent);
        } else if (itemId == R.id.menu_js) {
            intent = new Intent(this, JsActivity.class);
            startActivity(intent);
        } else if (itemId == R.id.menu_python) {
            intent = new Intent(this, PythonActivity.class);
            startActivity(intent);
        } else if (itemId == R.id.menu_sql) {
            intent = new Intent(this, SqlActivity.class);
            startActivity(intent);
        } else {
            return false;
        }
        return true;
    }

    // Setup click listeners for each CardView image
    private void setupCardViewImageClickListeners() {
        ImageView htmlImageView = findViewById(R.id.html);
        ImageView cssImageView = findViewById(R.id.css);
        ImageView jsImageView = findViewById(R.id.js);
        ImageView pythonImageView = findViewById(R.id.python);
        ImageView sqlImageView = findViewById(R.id.sql);

        if (htmlImageView != null) {
            htmlImageView.setOnClickListener(view -> openActivity(HtmlActivity.class));
        }
        if (cssImageView != null) {
            cssImageView.setOnClickListener(view -> openActivity(CssActivity.class));
        }
        if (jsImageView != null) {
            jsImageView.setOnClickListener(view -> openActivity(JsActivity.class));
        }
        if (pythonImageView != null) {
            pythonImageView.setOnClickListener(view -> openActivity(PythonActivity.class));
        }
        if (sqlImageView != null) {
            sqlImageView.setOnClickListener(view -> openActivity(SqlActivity.class));
        }
    }

    // Helper method to open an activity
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
