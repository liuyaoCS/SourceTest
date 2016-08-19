package com.ly.sourcetest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class MyRelativeLayout extends RelativeLayout{

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        //Log.i("ly","MyRelativeLayout dispatchTouchEvent "+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //Log.i("ly","MyRelativeLayout onTouchEvent "+event.getAction());
        return super.onTouchEvent(event);
    }
}
