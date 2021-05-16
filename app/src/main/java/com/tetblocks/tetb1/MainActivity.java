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

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.tet1);


         LinearLayout ln1 = findViewById(R.id.ln1);
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
          LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
        );


        ln1.addView(imageView, lp1);


        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(600,600);
        imageView.setLayoutParams(parms);


    }
}