package com.tlz.albumarc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddImageActivity extends AppCompatActivity {

    private ImageView ivAddImage;
    private EditText editTextAddTitle, editTestAddDescription;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Add Image Here");
        setContentView(R.layout.activity_add_image);

        ivAddImage = findViewById(R.id.ivAddImage);
        editTextAddTitle = findViewById(R.id.editTextAddTitle);
        editTestAddDescription = findViewById(R.id.editTextAddDescription);
        buttonSave = findViewById(R.id.buttonSave);

        ivAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}