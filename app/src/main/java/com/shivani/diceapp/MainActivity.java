package com.shivani.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtscroll;

    ImageView diceimg;

    Button btntoss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtscroll = findViewById(R.id.txtscroll);
        diceimg = findViewById(R.id.diceimg);
        btntoss = findViewById(R.id.btntoss);

     btntoss.setOnClickListener(view -> {
         Random random = new Random();
         int score = random.nextInt(6) + 1;
         txtscroll.setText(String.valueOf(score));



         switch (score)
         {

             case 1:
                 diceimg.setImageResource(R.drawable.img_12);
                 break;
             case 2:
                 diceimg.setImageResource(R.drawable.img_7);
                 break;
             case 3:
                 diceimg.setImageResource(R.drawable.img_8);
                 break;
             case 4 :
                 diceimg.setImageResource(R.drawable.img_13);
                 break;
             case 5:
                 diceimg.setImageResource(R.drawable.img_10);
                 break;
             case 6:
                 diceimg.setImageResource(R.drawable.img_14);
                 break;
         }

     });





    }
}