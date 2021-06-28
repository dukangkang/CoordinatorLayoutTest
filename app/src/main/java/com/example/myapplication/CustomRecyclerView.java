package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


public class CustomRecyclerView extends RecyclerView {
    public CustomRecyclerView(Context context) {
        super(context);
    }

    public CustomRecyclerView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        Log.w("dkkkk", "CustomRecyclerView -> onInterceptTouchEvent = " + e.getAction());
        return super.onInterceptTouchEvent(e);
    }
}
