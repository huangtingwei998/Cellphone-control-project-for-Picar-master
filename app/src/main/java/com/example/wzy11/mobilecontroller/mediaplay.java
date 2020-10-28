package com.example.wzy11.mobilecontroller;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

public class mediaplay extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private boolean ispause=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        File file=new File("/sdcard/yangqianhua.mp3");
        if(file.exists()){
            mediaPlayer=MediaPlayer.create(this, Uri.parse((file.getAbsolutePath())));
        }else{
            Toast.makeText(mediaplay.this,"要播放的视频不存在",Toast.LENGTH_SHORT).show();
            return;
        }

    }



}
