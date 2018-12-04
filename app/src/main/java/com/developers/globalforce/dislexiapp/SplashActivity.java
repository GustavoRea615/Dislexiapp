package com.developers.globalforce.dislexiapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

import java.util.TimerTask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.content.pm.ActivityInfo;

public class SplashActivity extends Activity {
    // Se establece la duración de la pantalla

    private static final long SPLASH_SCREEN_DELAY=5000;//Duracion
    //metodo onCreate

    //1920x1080
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        VideoView videoView = (VideoView) findViewById(R.id.videopan);

        Uri path = Uri.parse("android.resource://com.developers.globalforce.dislexiapp/"
                + R.raw.splashdef);

        videoView.setVideoURI(path);
        videoView.start();



        initComponents();
    }

    private void initComponents() {


        TimerTask task=new TimerTask() {

            @Override
            public void run() {
                startActivity(new Intent().setClass( SplashActivity.this, MainActivity.class));

            }
        };

        Timer timer=new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
