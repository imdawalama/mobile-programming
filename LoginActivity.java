package com.example.jalbandi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    CheckBox agreeTermCheckbox;
    Button loginButton, signupButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        email= findViewById(R.id.email_id);
        password = findViewById(R.id.password);
        agreeTermCheckbox = findViewById(R.id.Checkbox);
        loginButton =findViewById(R.id.Button1);
        signupButton = findViewById(R.id.Button2);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailValue = email.getText().toString();
                String passwordValue = password.getText().toString();

                Toast.makeText(LoginActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();

                Intent intent =new Intent(LoginActivity.this,NetworkImageActivity.class);
                intent.putExtra("email",emailValue);
                intent.putExtra("password",passwordValue);
                startActivity(intent);

            }
        });
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, Calculator.class));
            }
        });

}
    }