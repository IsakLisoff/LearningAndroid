package com.example.isaklisoff.learningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class imageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent fullIntent= getIntent();
        int i  = fullIntent.getIntExtra("intVariableName" , 0);
        ImageView fullImage = (ImageView) findViewById(R.id.imageView);
        fullImage.setImageResource(puppyImages[i]);
    }

    private Integer[] puppyImages =
            {
                    R.drawable.sample_2, R.drawable.sample_3,
                    R.drawable.sample_4, R.drawable.sample_5,
                    R.drawable.sample_6, R.drawable.sample_7,
                    R.drawable.sample_0, R.drawable.sample_1,
            };
}
