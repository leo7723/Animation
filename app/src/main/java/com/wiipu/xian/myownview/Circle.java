package com.wiipu.xian.myownview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by changliliao on 2017/3/26.
 */

public class Circle extends View {
    Paint mpaint;
    public Circle(Context context, AttributeSet attrs) {
        super(context,attrs);

        mpaint=new Paint();
        mpaint.setColor(getResources().getColor(R.color.colorBule));
        mpaint.setStrokeJoin(Paint.Join.ROUND);
        mpaint.setStrokeCap(Paint.Cap.ROUND);
        mpaint.setStrokeWidth(3);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        int h,w,r;
        h=getHeight();
        w=getWidth();
        r=Math.min(w,h)/2;
        canvas.drawCircle(w/2, h/2, r, mpaint);
    }
}
