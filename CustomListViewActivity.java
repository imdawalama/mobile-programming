package com.example.jalbandi;

import android.os.Bundle;
import android.widget.ListView;

import com.example.jalbandi.model.CustomModel;
import com.example.jalbandi.utils.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomListViewActivity extends AppCompatActivity {
    ListView customListview;
    CustomAdapter customAdapter;
    List<CustomModel> customModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);

        customListview = findViewById(R.id.custom_listview);
        customModelList.add(new CustomModel("software", "this is description of software", R.drawable.login));
        customModelList.add(new CustomModel("mobile", "this is description of mobile", R.drawable.login));
        customAdapter = new CustomAdapter(this, customModelList);
        customListview.setAdapter(customAdapter);
    }
}