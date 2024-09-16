package com.example.jalbandi.utils;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jalbandi.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView tvSn, tvName,tvRollNo;
    Button btnOptions;


    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSn = itemView.findViewById(R.id.recyler_sno);
        tvName =itemView.findViewById(R.id.recyler_name);
        tvRollNo = itemView.findViewById(R.id.recyler_rollno);
        btnOptions =itemView.findViewById(R.id.options_btn);
    }
}
