package com.example.jalbandi.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jalbandi.model.StudentModel;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_Name = "Jalbandi";
    private static final int DB_VERSION = 1;
    private static final String BCA_SIXTH = "bca_sixth";
    private static final String SYMBOL_NO = "Sn";
    private static final String NAME = "name";
    private static final String ROLL_NO = "roll_no";

    public DBHelper(@Nullable Context context, @Nullable SQLiteDatabase.CursorFactory factory) {
        super(context, DB_Name , factory, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE "+ BCA_SIXTH + "(" + SYMBOL_NO +" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + NAME + " TEXT, "  + ROLL_NO + " INTEGER " + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + BCA_SIXTH);
        onCreate(db);
    }

    //insert into table
    public void insertIntoDb(String name, int rollNo){
        SQLiteDatabase db = this.getWritableDatabase();
//        StudentModel studentModel = new StudentModel(name, rollNo);
        ContentValues values= new ContentValues();

        values.put(NAME,name);
        values.put(ROLL_NO,rollNo);

        db.insert(BCA_SIXTH,null,values);
    }
    //get data from database
    public ArrayList<StudentModel> getStudentsData(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor =db.rawQuery(" SELECT * FROM " + BCA_SIXTH,null);
        ArrayList<StudentModel> studentModeArrayList = new ArrayList<>();

        while  (cursor.moveToNext ()){
            StudentModel studentModel = new StudentModel(((Cursor) cursor).getInt(0), cursor.getString(1),cursor.getInt(2));

            studentModeArrayList.add(studentModel);
        }
        return studentModeArrayList;
    }
    public void updateStudentIntDatabase(StudentModel studentModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();


        contentValues.put(NAME,studentModel.getName());
        contentValues.put(ROLL_NO,studentModel.getRollNo());
        db.update(BCA_SIXTH,contentValues,SYMBOL_NO +"="+studentModel.getSn(),null);


    }
}

