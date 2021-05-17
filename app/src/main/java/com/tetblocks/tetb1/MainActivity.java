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

        ln1.setOrientation(LinearLayout.VERTICAL);


        LinearLayout lln [] = new LinearLayout[20];


        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(60,60);

        ImageView iv [] [] = new ImageView[10] [20];



        for(int i=0;i<lln.length;i++)
        {

            lln [i] = new LinearLayout(this);
            ln1.addView(lln[i],lp1);
            lln [i].setOrientation(LinearLayout.HORIZONTAL);


            for(int y=0;y<iv.length;y++)
            {
                iv [y] [i]= new ImageView(this) ;
                iv [y] [i].setImageResource(R.drawable.tet1);
                lln[i].addView(iv[y][i], lp1);
                iv[y][i].setLayoutParams(parms);

            }




        }






    }
}