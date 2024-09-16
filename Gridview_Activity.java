package com.example.jalbandi;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.example.jalbandi.model.CustomGridViewModel;
import com.example.jalbandi.utils.CustomGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Gridview_Activity extends AppCompatActivity {
    GridView gridView;
    CustomGridViewAdapter customGridViewAdapter;
    List<CustomGridViewModel> gridViewModelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gridview);
        gridView =findViewById(R.id.grid_view_layout);
        gridViewModelList.add( new CustomGridViewModel("software",R.drawable.login));
        gridViewModelList.add( new CustomGridViewModel("network",R.drawable.baseline_add_24));
        gridViewModelList.add( new CustomGridViewModel("hardware",R.drawable.login));
        gridViewModelList.add( new CustomGridViewModel("economics",R.drawable.baseline_add_24));

        customGridViewAdapter = new CustomGridViewAdapter(this, gridViewModelList);
gridView.setAdapter(customGridViewAdapter);
    }
}