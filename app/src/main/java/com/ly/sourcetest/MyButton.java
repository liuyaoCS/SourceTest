package com.ly.sourcetest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class MyButton extends View {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("ly","MyButton dispatchTouchEvent "+event.getAction());
        return super.dispatchTouchEvent(event);
    }
    boolean isMoved=false;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean ret=false;//=super.onTouchEvent(event);
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                ret=true;
                break;
            case MotionEvent.ACTION_MOVE:
                ret=true;
                break;
            case MotionEvent.ACTION_UP:
                ret=true;
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
        }
        ret=super.onTouchEvent(event);
        Log.i("ly","MyButton onTouchEvent "+event.getAction()+" ret="+ret);
        return ret;
    }
}
