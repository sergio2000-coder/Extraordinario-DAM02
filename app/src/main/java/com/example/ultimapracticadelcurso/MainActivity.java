package com.example.ultimapracticadelcurso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button foto, video;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foto=(Button)findViewById(R.id.foto);
        video=(Button)findViewById(R.id.rep_video);
        image=(ImageView)findViewById(R.id.image);

    }




}