package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import org.jetbrains.annotations.NotNull;

public class CustomCoordinatorLayout extends CoordinatorLayout {
    private final static String TAG = "dkkkk";

    public CustomCoordinatorLayout(@NonNull @NotNull Context context) {
        super(context);
    }

    public CustomCoordinatorLayout(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "CustomCoordinatorLayout -> onInterceptTouchEvent " + ev.getAction());
        boolean flag = super.onInterceptTouchEvent(ev);
        Log.e(TAG, "CustomCoordinatorLayout -> onInterceptTouchEvent flag = " + flag);
        return flag;
    }
}
