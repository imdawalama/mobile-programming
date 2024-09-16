package com.example.jalbandi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListViewActivity extends AppCompatActivity {
    ListView coursesListView;
    FloatingActionButton courses_Fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view);

        coursesListView = findViewById(R.id.listview);
        courses_Fab = findViewById(R.id.coursesfab);
        String[] courses = {"Networking", "Java", "Software Development", "CDC", "Flutter", "Economics", "PTE", "math"};
        ArrayList<String> coursesList = new ArrayList<>(Arrays.asList(courses));

        ArrayAdapter<String> coursesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesList);

/// onclick listener for courses fab floating action button
        courses_Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coursesList.add("Compiler Design");
                coursesList.add(3, "3rd Subject");

                coursesAdapter.notifyDataSetChanged();
            }
        });
    }
}