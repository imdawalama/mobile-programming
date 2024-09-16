package com.example.jalbandi;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NetworkImageActivity extends AppCompatActivity {
          ImageView imageView;
          final String image_url = "https://tse4.mm.bing.net/th?id=OIP.K3t8xZiBEh1iLJqDtEuIEgHaE3&pid=Api&P=0&h=220";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_network_image);

        imageView =findViewById(R.id.img_network);
        Glide.with(this).load(image_url).into(imageView);
    }
}