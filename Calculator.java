package com.example.jalbandi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends Activity {
EditText firste, seconde;
Button btn;
TextView resulte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        firste = findViewById(R.id.first);
        seconde = findViewById(R.id.second);
        btn = findViewById(R.id.btn);
        resulte = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second, result;
                first =Integer.parseInt(firste.getText().toString());
                second =Integer.parseInt(seconde.getText().toString());
                result = first + second;
                resulte.setText("Result="+result);
            }
        });
    }
}