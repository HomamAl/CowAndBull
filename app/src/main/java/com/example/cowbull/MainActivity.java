package com.example.cowbull;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int r1;
    private int r2;
    private int r3;
    TextView sn, sn1, sn2;
    TextView guessA, guessB, guessC;
    private  int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sn = findViewById(R.id.SecretNumberA);
        sn1 = findViewById(R.id.secretNumberB);
        sn2 = findViewById(R.id.secretNumberC);

        guessA = findViewById(R.id.guessA);
        guessB = findViewById(R.id.guessB);
        guessC = findViewById(R.id.guessC);

    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view){

        TextView txt = findViewById(R.id.SecretNumberA);
        TextView txt1 = findViewById(R.id.secretNumberB);
        TextView txt2 = findViewById(R.id.secretNumberC);

        Random random = new Random();
        r1 = random.nextInt(9);
        txt.setText(Integer.toString(r1));

        Random random1 = new Random();
        r2 = random1.nextInt(9);
        txt1.setText(Integer.toString(r2));

        Random random2 = new Random();
        r3= random2.nextInt(9);
        txt2.setText(Integer.toString(r3));

        TextView guess1 = findViewById(R.id.guessA);
        TextView guess2 = findViewById(R.id.guessB);
        TextView guess3 = findViewById(R.id.guessC);

       /* int stringToInt = Integer.parseInt(guessA.getText().toString());
        int stringToInt1 = Integer.parseInt(guessB.getText().toString());
        int stringToInt2 = Integer.parseInt(guessC.getText().toString());

        if(r1 == stringToInt){
            count++;
        }

        if(r2 == stringToInt1){
            count++;
        }

        if(r3 == stringToInt2){
            count++;
        }*/


    }
}
