package com.sanacoder.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.leftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.rightDice);


        final int[] diceArray = { R.drawable.index1,
                            R.drawable.index2,
                            R.drawable.index3,
                            R.drawable.index4,
                            R.drawable.index5,
                            R.drawable.index6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("DiceApp","Button is pressed");

                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(6);
                leftDice.setImageResource(diceArray[number]);

                number = randomnumbergenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
