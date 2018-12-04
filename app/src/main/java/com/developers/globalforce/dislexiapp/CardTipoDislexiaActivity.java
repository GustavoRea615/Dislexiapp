package com.developers.globalforce.dislexiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CardTipoDislexiaActivity extends Activity implements View.OnClickListener {

    CardView fono, visual, profun, test, act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //      WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tipo_dislexia);
        fono = (CardView) findViewById(R.id.card_fono);
        visual = (CardView) findViewById(R.id.card_visual);
        profun = (CardView) findViewById(R.id.card_profunda);
        test = (CardView)findViewById(R.id.card_test);
        act = (CardView)findViewById(R.id.card_actividades);

        fono.setOnClickListener(this);
        visual.setOnClickListener(this);
        profun.setOnClickListener(this);
        test.setOnClickListener(this);
        act.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.card_fono:
                Intent fono = new Intent(getApplicationContext(), DislexiaFonologicaInicialActivity.class);
                startActivity(fono);
                break;
            case R.id.card_visual:
                Intent visual = new Intent(getApplicationContext(), DislexiaVisualInicialActivity.class);
                startActivity(visual);

                break;
            case R.id.card_profunda:
                Intent profundidad = new Intent(getApplicationContext(), DislexiaProfundidadInicialActivity.class);
                startActivity(profundidad);
                break;

            case R.id.card_test:
                Intent testCom = new Intent(getApplicationContext(), TestCompletoActivity.class);
                startActivity(testCom);
                break;

            case R.id.card_actividades:
                Intent actividades = new Intent(getApplicationContext(), CardActividadesIndActivity.class);
                startActivity(actividades);
                break;

            default:

                break;
        }
    }
}


