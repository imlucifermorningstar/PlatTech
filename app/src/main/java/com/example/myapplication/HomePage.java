package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private Button backB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        backB = findViewById(R.id.start_button);

        backB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Start sign up activity
            Intent intent = new Intent(HomePage.this, MainActivity.class);
            startActivity(intent);
        }
    });
    }
}