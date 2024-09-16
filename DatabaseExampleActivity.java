package com.example.jalbandi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jalbandi.model.StudentModel;
import com.example.jalbandi.utils.DBHelper;

import java.util.ArrayList;
import java.util.jar.Attributes;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DatabaseExampleActivity extends AppCompatActivity {
  Button insertIntoDbBtn,getInsertIntoDbBtn;
  EditText studentName,studentRollno;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_database_example);
        insertIntoDbBtn =findViewById(R.id.insert_button);
        getInsertIntoDbBtn = findViewById(R.id.get_button);
        studentName = findViewById(R.id.student_name);
        studentRollno = findViewById(R.id.student_rollno);

        String name = studentName.getText().toString();
        int rollNo = Integer.parseInt(studentRollno.getText().toString());


insertIntoDbBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        DBHelper dbHelper = new DBHelper(DatabaseExampleActivity.this,null);
        dbHelper.insertIntoDb(name,rollNo);

    }
});
getInsertIntoDbBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(DatabaseExampleActivity.this, Recyclerviewactivity.class));
    }
});


        //update
//        StudentModel updateStudentModel = new StudentModel(2,"lama",101);
//        dbHelper.updateStudentIntDatabase(updateStudentModel);
//
//        //get student from database
//        ArrayList<StudentModel> studentListDatabase = dbHelper.getStudentsData();
//        for(int i=0;i<studentListDatabase.size();i++){
//            Log.e("SQLITE DATABASE", "Name"+ studentListDatabase.get(i).getName()+ "RollNo"+studentListDatabase.get(i).getRollNo());
//        }
    }
}