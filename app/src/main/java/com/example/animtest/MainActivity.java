package com.example.animtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Button animBtn;
    Animation myAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id define here
        imgView = findViewById(R.id.imageView);
        animBtn = findViewById(R.id.animBtn);
        myAnim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim);


        // button on click listener
        animBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //animation start
                imgView.startAnimation(myAnim);
            }
        });
    }
}