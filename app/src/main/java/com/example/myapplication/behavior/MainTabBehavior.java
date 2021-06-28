package com.example.myapplication.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.example.myapplication.R;


/**
 * Tab Behavior
 */
public class MainTabBehavior extends CoordinatorLayout.Behavior<View> {

    private Context mContext;

    public MainTabBehavior() {
    }

    public MainTabBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return isDependOn(dependency);
    }


    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        Log.w("dkkkkk", "dependency.getTranslationY() = " + dependency.getTranslationY());
        Log.w("dkkkkk", "dependency.getHeight() = " + dependency.getHeight());
        float per = dependency.getTranslationY() / getHeaderOffset();
        Log.w("dkkkkk", "per = " + per);
        float tabScrollY = per * (dependency.getHeight() - getTitleHeight());
        float y = dependency.getHeight() - tabScrollY;
        child.setTranslationY(y);
//        Log.w("dkkk", "tab y = " + y);
        return true;
    }

    private int getHeaderOffset() {
        return mContext.getResources().getDimensionPixelOffset(R.dimen.header_offset);
    }

    private int getTitleHeight() {
        return mContext.getResources().getDimensionPixelOffset(R.dimen.title_height);
    }


    private boolean isDependOn(View dependency) {
        return dependency != null && dependency.getId() == R.id.homemain_top_flyt;
    }
}
