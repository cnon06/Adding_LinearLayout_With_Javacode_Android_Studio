package com.tetblocks.tetb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout ln1 = findViewById(R.id.ln1);
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        );

        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(75,75);

        ImageView iv [] [] = new ImageView[10] [20];


        for(int i=0;i<iv.length;i++)
        {
            iv [i] [0]= new ImageView(this) ;
            iv [i] [0].setImageResource(R.drawable.tet1);
            ln1.addView(iv[i][0], lp1);
            iv[i][0].setLayoutParams(parms);
            
        }

    }
}