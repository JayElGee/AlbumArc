package com.tlz.albumarc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class UpdateImageActivity extends AppCompatActivity {

    private ImageView ivUpdateImage;
    private EditText editTextUpdateTitle, editTextUpdateDescription;
    private Button buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Update Image");
        setContentView(R.layout.activity_update_image);

        ivUpdateImage = findViewById(R.id.ivUpdateImage);
        editTextUpdateTitle = findViewById(R.id.editTextUpdateTitle);
        editTextUpdateDescription = findViewById(R.id.editTextUpdateDescription);
        buttonUpdate = findViewById(R.id.buttonUpdate);

        ivUpdateImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}