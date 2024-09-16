package com.example.jalbandi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Constant_Layout extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    final String[] foodItems={"momo","pizza","burger","laphing"};
    Spinner valuesSpinner;
    TextView email;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constant_layout);

        valuesSpinner = findViewById(R.id.values_spinner);
        valuesSpinner.setOnItemSelectedListener(this);

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,foodItems);
        valuesSpinner.setAdapter(arrayAdapter);

        // get values via intent class

        Intent intent = getIntent();
        String emailIDValue = intent.getStringExtra("email");
        String passwordIDValue = intent.getStringExtra("password");

        email = findViewById(R.id.email_id);
        email.setText(emailIDValue);

        password = findViewById(R.id.password);
        password.setText(passwordIDValue);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l) {
        Toast.makeText(this,foodItems[index], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}