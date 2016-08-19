package com.ly.sourcetest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class MyLinearLayout extends LinearLayout{
    boolean intercepted=false;
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i("ly","MyLinearLayout dispatchTouchEvent "+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
////        boolean ret=false;
////        int action=ev.getAction();
////        switch(action){
////            case MotionEvent.ACTION_MOVE:
////                intercepted=!intercepted;
////                break;
////            case MotionEvent.ACTION_CANCEL:
////            case MotionEvent.ACTION_UP:
////            case MotionEvent.ACTION_DOWN:
////                intercepted=false;
////                break;
////            default:
////                break;
////        }
////        return intercepted;
//        return true;
//    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("ly","MyLinearLayout onTouchEvent "+event.getAction());
        return super.onTouchEvent(event);
    }
}
