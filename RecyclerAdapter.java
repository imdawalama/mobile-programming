package com.example.jalbandi.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;

import com.example.jalbandi.R;
import com.example.jalbandi.model.StudentModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
Context context;
ArrayList<StudentModel> studentModelArrayList;
 public RecyclerAdapter(Context context,ArrayList<StudentModel> studentModelArrayList){
    this.context = context;
    this.studentModelArrayList = studentModelArrayList;
}
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_recyclerview_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int index) {
             holder.tvSn.setText(String.valueOf(studentModelArrayList.get(index).getSn()));
             holder.tvName.setText(studentModelArrayList.get(index).getName());
             holder.tvRollNo.setText(String.valueOf(studentModelArrayList.get(index).getRollNo()));
             holder.btnOptions.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     PopupMenu popupMenu = new PopupMenu(context, v);
                     popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
                     popupMenu.show();
                 }
             });
    }

    @Override
    public int getItemCount() {
        return studentModelArrayList.size();
    }
}
