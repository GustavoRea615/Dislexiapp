package com.developers.globalforce.dislexiapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Collections;

public class DislexiaFonologicaInicialActivity extends Activity {

    MediaPlayer content, correctSound, wrongSound;
    ImageButton btn;
    Boolean counter = (true);

    private ArrayList<Integer> myList = new ArrayList<>();//arraylist to hold sequential numbers from 1 to however many objects needed.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dislexia_fonologica_inicial);

        //alert box that pops up as this activity loads.
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Instrucciones.");
        alertDialog.setMessage("Encuentra la letra perdida" +
                "\npuedes pulsar la palabra para escucharla");
        alertDialog.setButton("Iniciemos!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        correctSound = MediaPlayer.create(this, R.raw.success);
        wrongSound = MediaPlayer.create(this, R.raw.wrong);

        alertDialog.setIcon(R.drawable.question);//this is the question mark icon on the hint popup page
        alertDialog.show();//this tells the above icon to show

        content = MediaPlayer.create(this, R.raw.dado);

        btn = (ImageButton) findViewById(R.id.dropBtn);//image button to be changed
        Random();//Running the random method
    }

    public void Random() {
        while (counter == (true)) {
            for (int i = 1; i < 27; i++) {
                myList.add(Integer.valueOf(i));
            }
            Collections.shuffle(myList);
            counter = (false);
        }

        if (myList.isEmpty()) {
            //TO DO: set a method here that tells them the game is over.
            //this alert ends the game an outputs the score
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Hooray!!");
            alertDialog.setMessage("Congratulations, Your learning! ");
            alertDialog.setButton("Proceed", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            });


            //commented out sound since not needed at the moment.
        }
            if (myList.get(0) == 1) {//if the integer at index 0 is a 1, set image to A.
            btn.setImageResource(R.drawable.arana);
              content = MediaPlayer.create(this, R.raw.arana);
        } else if (myList.get(0) == 2) {//if the integer at index 0 is a 2, set image to B.
            btn.setImageResource(R.drawable.abaco);
              content = MediaPlayer.create(this, R.raw.abaco);
        } else if (myList.get(0) == 3) {//if the integer at index 0 is a 3, set image to C.
            btn.setImageResource(R.drawable.casa);
             content = MediaPlayer.create(this, R.raw.casa);
        } else if (myList.get(0) == 4) {//if the integer at index 0 is a 4, set image to D.
            btn.setImageResource(R.drawable.dado);
              content = MediaPlayer.create(this, R.raw.dado);
        } else if (myList.get(0) == 5) {//if the integer at index 0 is a 5, set image to E.
            btn.setImageResource(R.drawable.cocheee);
              content = MediaPlayer.create(this, R.raw.coche);
        } else if (myList.get(0) == 6) {//if the integer at index 0 is a 6, set image to F.
            btn.setImageResource(R.drawable.ficha);
              content = MediaPlayer.create(this, R.raw.ficha);
        } else if (myList.get(0) == 7) {//if the integer at index 0 is a 7, set image to G.
            btn.setImageResource(R.drawable.gato);
              content = MediaPlayer.create(this, R.raw.gato);
        } else if (myList.get(0) == 8) {//if the integer at index 0 is a 8, set image to H.
            btn.setImageResource(R.drawable.coche);
              content = MediaPlayer.create(this, R.raw.coche);
        } else if (myList.get(0) == 9) {//if the integer at index 0 is a 9, set image to I.
            btn.setImageResource(R.drawable.nariz);
              content = MediaPlayer.create(this, R.raw.nariz);
        } else if (myList.get(0) == 10) {//if the integer at index 0 is a 10, set image to J.
            btn.setImageResource(R.drawable.jabon);
              content = MediaPlayer.create(this, R.raw.jabon);
        } else if (myList.get(0) == 11) {//if the integer at index 0 is a 11, set image to K.
            btn.setImageResource(R.drawable.kilo);
            content = MediaPlayer.create(this, R.raw.kilo);
        } else if (myList.get(0) == 12) {//if the integer at index 0 is a 12, set image to L.
            btn.setImageResource(R.drawable.globo);
              content = MediaPlayer.create(this, R.raw.globo);
        } else if (myList.get(0) == 13) {//if the integer at index 0 is a 13, set image to M.
            btn.setImageResource(R.drawable.mar);
             content = MediaPlayer.create(this, R.raw.mariposa);
        } else if (myList.get(0) == 14) {//if the integer at index 0 is a 14, set image to N.
            btn.setImageResource(R.drawable.nuevo);
             content = MediaPlayer.create(this, R.raw.nuevo);
        } else if (myList.get(0) == 15) {//if the integer at index 0 is a 15, set image to O.
            btn.setImageResource(R.drawable.reloj);
             content = MediaPlayer.create(this, R.raw.reloj);
        } else if (myList.get(0) == 16) {//if the integer at index 0 is a 16, set image to P.
            btn.setImageResource(R.drawable.pato);
              content = MediaPlayer.create(this, R.raw.pato);
        } else if (myList.get(0) == 17) {//if the integer at index 0 is a 17, set image to Q.
            btn.setImageResource(R.drawable.queso);
             content = MediaPlayer.create(this, R.raw.queso);
        } else if (myList.get(0) == 18) {//if the integer at index 0 is a 18, set image to R.
            btn.setImageResource(R.drawable.ropa);
             content = MediaPlayer.create(this, R.raw.ropa);
        } else if (myList.get(0) == 19) {//if the integer at index 0 is a 19, set image to S.
            btn.setImageResource(R.drawable.sueno);
              content = MediaPlayer.create(this, R.raw.sueno);
        } else if (myList.get(0) == 20) {//if the integer at index 0 is a 20, set image to T.
            btn.setImageResource(R.drawable.paleta);
              content = MediaPlayer.create(this, R.raw.paleta);
        } else if (myList.get(0) == 21) {//if the integer at index 0 is a 21, set image to U.
            btn.setImageResource(R.drawable.uva);
              content = MediaPlayer.create(this, R.raw.uva);
        } else if (myList.get(0) == 22) {//if the integer at index 0 is a 22, set image to V.
            btn.setImageResource(R.drawable.vaca);
             content = MediaPlayer.create(this, R.raw.vaca);
        } else if (myList.get(0) == 23) {//if the integer at index 0 is a 23, set image to W.
            btn.setImageResource(R.drawable.kiwi);
             content = MediaPlayer.create(this, R.raw.kiwi);
        } else if (myList.get(0) == 24) {//if the integer at index 0 is a 24, set image to X.
            btn.setImageResource(R.drawable.taxi);
             content = MediaPlayer.create(this, R.raw.taxi);
        } else if (myList.get(0) == 25) {//if the integer at index 0 is a 25, set image to Y.
            btn.setImageResource(R.drawable.joya);
             content = MediaPlayer.create(this, R.raw.joya);
        } else if (myList.get(0) == 26) {//if the integer at index 0 is a 26, set image to Z.
            btn.setImageResource(R.drawable.lapiz);
             content = MediaPlayer.create(this, R.raw.lapiz);
        }
    }



    public void playSound(View view) {
        content.start();
    }


    public void dropBtn(View view) {//code for playing description sound
        content.start();
    }

    public void ABtn(View view) {
        if (myList.get(0) == 1) {
            correctSound.start();
        } else {
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void BBtn(View view) {
        if (myList.get(0) == 2) {
            correctSound.start();
        } else {
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void CBtn(View view) {
        if (myList.get(0) == 3) {
            correctSound.start();
        } else {
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void DBtn(View view) {
        if (myList.get(0) == 4) {
            correctSound.start();
        } else {
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void EBtn(View view){
        if(myList.get(0) == 5){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void FBtn(View view){
        if(myList.get(0) == 6){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void GBtn(View view){
        if(myList.get(0) == 7){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void HBtn(View view){
        if(myList.get(0) == 8){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void IBtn(View view){
        if(myList.get(0) == 9){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void JBtn(View view){
        if(myList.get(0) == 10){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void KBtn(View view){
        if(myList.get(0) == 11){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void LBtn(View view){
        if(myList.get(0) == 12){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }


    public void MBtn(View view){
        if(myList.get(0) == 13){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void NBtn(View view){
        if(myList.get(0) == 14){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void OBtn(View view){
        if(myList.get(0) == 15){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void PBtn(View view){
        if(myList.get(0) == 16){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void QBtn(View view){
        if(myList.get(0) == 17){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void RBtn(View view){
        if(myList.get(0) == 18){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void SBtn(View view){
        if(myList.get(0) == 19){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void TBtn(View view){
        if(myList.get(0) == 20){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void UBtn(View view){
        if(myList.get(0) == 21){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void VBtn(View view){
        if(myList.get(0) == 22){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void WBtn(View view){
        if(myList.get(0) == 23){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void XBtn(View view){
        if(myList.get(0) == 24){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void YBtn(View view){
        if(myList.get(0) == 25){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }

    public void ZBtn(View view){
        if(myList.get(0) == 26){
            correctSound.start();
        }
        else{
            wrongSound.start();

        }
        myList.remove(0);//removes the index 0 which has a unique number so this number cannot come up again.
        Random(); //regenerates the random method to get the next number. This number wont come up again as its been removed above
    }
}
