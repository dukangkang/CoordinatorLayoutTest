//package com.example.myapplication.test;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//
//import com.example.myapplication.R;
//import com.example.myapplication.behavior.MainHeaderBehavior;
//
//
//public class TestActivity extends AppCompatActivity implements MainHeaderBehavior.OnHeaderStateListener, View.OnClickListener {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//        initTestBottom();
//    }
//
//    private void initTestBottom() {
//       TestFragment typeFragment = new TestFragment();
//        if (typeFragment != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.homemain_botm_flyt111, typeFragment)
//                    .commitAllowingStateLoss();
//        }
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }
//
//    @Override
//    public void onHeaderClosed() {
//
//    }
//
//    @Override
//    public void onHeaderOpened() {
//
//    }
//}
