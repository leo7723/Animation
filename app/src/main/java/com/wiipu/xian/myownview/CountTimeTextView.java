package com.wiipu.xian.myownview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by changliliao on 2017/2/23.
 */

public class CountTimeTextView extends TextView implements Runnable{

    private boolean isRunning=false;

    private final int COUNT=1;
    private int num=0;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case COUNT:setText(num++);
                    Log.v("COUNT","XXXXXXXXX");
                    break;
            }
        }
    };

    public CountTimeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CountTimeTextView(Context context) {
        super(context);
    }

    @Override
    public void run() {
        if (isRunning)
        setText(num++);
        postDelayed(this,1000);
    }

    public  void  start(){
        isRunning=true;
        run();
    }

    public void stop(){
        isRunning=false;
    }

}
