package com.example.jalbandi;

import android.os.Bundle;

import com.example.jalbandi.model.StudentModel;
import com.example.jalbandi.utils.DBHelper;
import com.example.jalbandi.utils.RecyclerAdapter;

import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Recyclerviewactivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recyclerviewactivity);
        recyclerView = findViewById(R.id.recycler_view);

        DBHelper dbHelper = new DBHelper(Recyclerviewactivity.this,null);
        ArrayList<StudentModel> studentsListFromDatabase = dbHelper.getStudentsData();

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(Recyclerviewactivity.this,studentsListFromDatabase);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

    }
}