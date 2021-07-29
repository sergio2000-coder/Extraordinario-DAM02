package com.example.ultimapracticadelcurso;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.ultimapracticadelcurso.R.id.reproducir_video;

public class activity_video extends AppCompatActivity {
    Button reproducir_audio,reproducir_video;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        setContentView(R.id.reproducir_video);
        reproducir_video= (Button)findViewById(R.id.rep_video);
        reproducir_audio=(Button)findViewById(R.id.rep_audio);
        Uri myUri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        myUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sonido);
        SurfaceView videoView = (SurfaceView)findViewById(R.id.reproducir_video);

        videoView.setVideoURI(myUri);
        videoView.setMediaController(new MediaController.getAplicationContext());


        videoView.requestFocus();
        reproduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                videoView.seekTo(0);
            }
        });
        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });
    }
}