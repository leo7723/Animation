package com.wiipu.xian.myownview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

/**
 * Created by changliliao on 2017/3/26.
 */

public class Wave extends ViewGroup {

    protected Wave(Context context) {
        super(context);
        inflate(context,R.layout.waves,Wave.this);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

}
