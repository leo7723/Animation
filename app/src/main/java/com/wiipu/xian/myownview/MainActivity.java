package com.wiipu.xian.myownview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View wave1,wave2,wave3,wave4,wave5;
    Button btn,stop;
    Circle circle1,circle2,circle3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wave1=findViewById(R.id.wave1);
        wave2=findViewById(R.id.wave2);
        wave3=findViewById(R.id.wave3);
        wave4=findViewById(R.id.wave4);
        wave5=findViewById(R.id.wave5);
        circle1= (Circle) findViewById(R.id.circle1);
        circle2= (Circle) findViewById(R.id.circle2);
        circle3= (Circle) findViewById(R.id.circle3);
        btn= (Button) findViewById(R.id.start);
        stop= (Button) findViewById(R.id.stop);

        final Animation animation,animation2,animation3,animation4,animation5,animation6;
        animation= AnimationUtils.loadAnimation(this,R.anim.wave_nim);
        animation2=AnimationUtils.loadAnimation(this,R.anim.wave_nim2);
        animation3=AnimationUtils.loadAnimation(this,R.anim.wave_nim3);
        animation4=AnimationUtils.loadAnimation(this,R.anim.record_anim);
        animation5=AnimationUtils.loadAnimation(this,R.anim.record_anim2);
        animation6=AnimationUtils.loadAnimation(this,R.anim.record_anim3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave1.startAnimation(animation);
                wave2.startAnimation(animation2);
                wave3.startAnimation(animation);
                wave4.startAnimation(animation2);
                wave5.startAnimation(animation);
                circle3.startAnimation(animation4);
                circle2.startAnimation(animation5);
                circle1.startAnimation(animation6);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave1.clearAnimation();
                wave2.clearAnimation();
                wave3.clearAnimation();
                wave4.clearAnimation();
                wave5.clearAnimation();
            }
        });
    }
}
