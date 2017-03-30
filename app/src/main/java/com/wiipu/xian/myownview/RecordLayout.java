package com.wiipu.xian.myownview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

/**
 * Created by changliliao on 2017/3/30.
 */

public class RecordLayout extends LinearLayout {
    BlueCircle circle1,circle2,circle3;
    Animation animation1,animation2,animation3;
    public RecordLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view= View.inflate(context,R.layout.record_layout,this);

        circle1= (BlueCircle) view.findViewById(R.id.circle1);
        circle2= (BlueCircle) view.findViewById(R.id.circle2);
        circle3= (BlueCircle) view.findViewById(R.id.circle3);

        animation1= AnimationUtils.loadAnimation(context , R.anim.wave_nim);
        animation2=AnimationUtils.loadAnimation(context ,R.anim.wave_nim2);
        animation3=AnimationUtils.loadAnimation(context,R.anim.wave_nim3);

    }

    public  void startAnimaton(){
        circle1.startAnimation(animation1);
        circle2.startAnimation(animation2);
        circle3.startAnimation(animation3);
    }

    public void stopAnimation(){
        circle1.clearAnimation();
        circle2.clearAnimation();
        circle3.clearAnimation();
    }


}
