package com.example.tecsup.facebook;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button button_publicar;
    ImageButton  img_publicar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_publicar=findViewById(R.id.btn_publicar);
        img_publicar=findViewById(R.id.img_camara);
        button_publicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamaIntent();
            }
        });


        }
        void llamaIntent(){
            Intent talkPictureIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if(talkPictureIntent.resolveActivity(getPackageManager())!=null){
                
            }


        }

    }

