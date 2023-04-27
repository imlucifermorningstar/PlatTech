package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        // Find views
        usernameEditText = findViewById(R.id.username_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        signupButton = findViewById(R.id.signup_button);

        // Set onClickListener for signup button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform sign-up logic here
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                // Validate username and password
                if (username.isEmpty()) {
                    usernameEditText.setError("Username cannot be empty");
                    return;
                }
                if (password.isEmpty()) {
                    passwordEditText.setError("Password cannot be empty");
                    return;
                }
                // Save user data to a database or server
                // ...
                // Show success message and navigate to login activity
                Toast.makeText(SignUp.this, "Sign-up successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp.this, Main_Page.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
