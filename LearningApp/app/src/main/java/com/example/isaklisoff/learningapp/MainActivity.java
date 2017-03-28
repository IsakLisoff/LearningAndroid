package com.example.isaklisoff.learningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{


    public int testInt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview =(GridView) findViewById(R.id.gridview);


        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                //Intent imageIntent = new Intent(, imageActivity.class);
                testInt = i;

               // startActivity(imageIntent);

                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
            }
        });




    }

    public void fullScreen(View view)
    {
        Intent imageIntent = new Intent(this, imageActivity.class);
        int imageInt = testInt;
        imageIntent.putExtra("intVariableName", imageInt);
        startActivity(imageIntent);
    }

}
