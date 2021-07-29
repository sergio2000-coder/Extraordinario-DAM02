package com.example.ultimapracticadelcurso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_foto extends AppCompatActivity {
Button toma_foto;
ImageView fotografia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toma_foto = (Button)findViewById(R.id.tomafoto);
        fotografia = (ImageView) findViewById(R.id.foto);

        toma_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TomarFotografia();
            }
        });
    }

    private void TomarFotografia() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0){
            if(resultCode==RESULT_OK){
                Bitmap bitmap = (Bitmap)data.getExtras().get("data");
                fotografia.setImageBitmap(bitmap);
            }
        }
    }
}