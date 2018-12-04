package com.developers.globalforce.dislexiapp;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;



public class MainActivity extends Activity implements View.OnClickListener{
    ImageView entrar;
    ImageView config;
    ImageView about;
    ImageView user;
    MediaPlayer colours;
    MediaPlayer numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        entrar = (ImageView)findViewById(R.id.btn_play);
        config = (ImageView)findViewById(R.id.btn_settings);
        about = (ImageView)findViewById(R.id.btn_about);
        user = (ImageView)findViewById(R.id.btn_user);

        entrar.setOnClickListener(this);
        config.setOnClickListener(this);
        about.setOnClickListener(this);
        user.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_play:
                Intent i = new Intent(getApplicationContext(), CardTipoDislexiaActivity.class);
                startActivity(i);
                break;
            case R.id.btn_settings:

                break;
            case R.id.btn_user:
                //Intent a = new Intent(getApplicationContext(), VideoInfActivity.class);
                //startActivity(a);
                break;
            case R.id.btn_about:

                break;

            default:

                break;
        }
    }
}
