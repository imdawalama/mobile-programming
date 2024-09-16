package com.example.jalbandi;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagePickingActivity extends AppCompatActivity {
ImageView galleryImageView;
Button pickImageBtn;
final static int PICK_IMAGE = 100;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image_picking);

     galleryImageView =findViewById(R.id.gallery_imageview);
     pickImageBtn =findViewById(R.id.btn_image_pick);

     pickImageBtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             openGallery();
         }
     });
    }
    private void openGallery(){
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intent,PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PICK_IMAGE && resultCode ==RESULT_OK ){
             galleryImageView.setImageURI(data.getData());
        }
    }
}