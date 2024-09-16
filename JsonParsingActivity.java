package com.example.jalbandi;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JsonParsingActivity extends AppCompatActivity {
    TextView name, salary,martial_status;
    String sample_json = "{\"employee\":{\"name\":\"sonoo\",\"salary\":56000,\"married\":true}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_json_parsing);

        name = findViewById(R.id.json_name);
        salary = findViewById(R.id.json_salary);
        martial_status =findViewById(R.id.json_maritalstatus);

        try {

            JSONObject jsonObject = new JSONObject(sample_json);
            JSONObject employeeJsonObject = jsonObject.getJSONObject("employee");
            name.setText("Name:" + employeeJsonObject.getString("name"));
            salary.setText("salary:" +employeeJsonObject.getString("salary"));
            martial_status.setText("marital Status:" +employeeJsonObject.getString("married"));


        } catch (JSONException e) {
            e.printStackTrace();

        }
    }
}