package com.example.satunnaislukugeneraattori_2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tervehdiKayttajaa(View view){

        Toast tervehdiKayttajaa = Toast.makeText(this, "Tervehdys Käyttäjä! Kasvata numeroita tai nollaa numero!",
                Toast.LENGTH_SHORT);
        tervehdiKayttajaa.show();
    }

    public void countMe (View view) {

        TextView showCountTextView = (TextView)
                findViewById(R.id.numeroNaytto);


        String countString = showCountTextView.getText().toString();


        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    public void nollaaMut (View view) {
        TextView showCountTextView = (TextView)
                findViewById(R.id.numeroNaytto);


        String countString = showCountTextView.getText().toString();


        Integer count = Integer.parseInt(countString);
        count = 0;


        showCountTextView.setText(count.toString());


    }

    public void arvoMut (View view) {
        TextView showCountTextView = (TextView)
                findViewById(R.id.numeroNaytto);


        String countString = showCountTextView.getText().toString();


        Integer count = Integer.parseInt(countString);
        count = (int)(Math.random()*50);


        showCountTextView.setText(count.toString());
    }

   }

