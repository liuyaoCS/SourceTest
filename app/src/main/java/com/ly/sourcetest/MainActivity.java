package com.ly.sourcetest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;

public class MainActivity extends Activity {
    View btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_test);
        btn= findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ly","clicked");
            }
        });

        final ViewTreeObserver observer=btn.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                btn.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int height=btn.getMeasuredHeight();
                Log.i("ly","height->"+height);
                Log.i("ly","height->"+height);
            }
        });

        int w = View.MeasureSpec.makeMeasureSpec((1<<30)-1,View.MeasureSpec.AT_MOST);
        int h = View.MeasureSpec.makeMeasureSpec((1<<30)-1,View.MeasureSpec.AT_MOST);
        btn.measure(w, h);
        Log.i("ly", "height:" + btn.getMeasuredHeight() + "  ,width:" + btn.getMeasuredWidth());
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        //Log.i("ly","MainActivity dispatchTouchEvent "+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       // Log.i("ly","MainActivity onTouchEvent "+event.getAction());
        return super.onTouchEvent(event);
    }
}
