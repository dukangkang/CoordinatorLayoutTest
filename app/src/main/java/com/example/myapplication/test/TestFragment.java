//package com.example.myapplication.test;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.design.widget.CoordinatorLayout;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.LinearLayout;
//
//
//import com.example.myapplication.CustomRecyclerView;
//import com.example.myapplication.R;
//import com.example.myapplication.behavior.MainHeaderBehavior;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestFragment extends Fragment implements MainHeaderBehavior.OnHeaderStateListener, View.OnClickListener {
//    private LinearLayout mHeaderFlyt;
//
//    private CustomRecyclerView mRecyclerView = null;
//
//    private MainHeaderBehavior mHeaderBehavior;
//
//    public TestFragment() {
//
//    }
//
//    @Nullable
//    @org.jetbrains.annotations.Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
//        View view = LayoutInflater.from(getActivity()).inflate(R.layout.activity_test3, container, false);
//        return view;
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        init();
//    }
//
//    protected void init() {
//        mHeaderFlyt = getView().findViewById(R.id.homemain_top_flyt);
//
//        mHeaderBehavior = (MainHeaderBehavior) ((CoordinatorLayout.LayoutParams)mHeaderFlyt.getLayoutParams()).getBehavior();
//
//        if (mHeaderBehavior != null) {
////            mHeaderBehavior.setTabSuspension(true);
//            mHeaderBehavior.setHeaderStateListener(this);
//        }
//
//        initBotmView();
//
//        initRecyclerView();
//    }
//
//    /**
//     * 初始化底部资讯模块
//     */
//    public void initBotmView() {
//        TypeFragment typeFragment = TypeFragment.newInstance();
//
//        if (typeFragment != null) {
//            getChildFragmentManager().beginTransaction()
//                    .replace(R.id.homemain_botm_flyt, typeFragment)
//                .commitAllowingStateLoss();
//        }
//    }
//
//    private void initRecyclerView() {
//        mRecyclerView = getView().findViewById(R.id.my_list);
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 4; i++) {
//            list.add(i + 1 + "");
//        }
//        TypeAdapter adapter = new TypeAdapter(getActivity(), list, false);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        mRecyclerView.setLayoutManager(layoutManager);
//        mRecyclerView.setAdapter(adapter);
//    }
//
//    @Override
//    public void onHeaderClosed() {
//        Log.e("status", "closed");
//    }
//
//    @Override
//    public void onHeaderOpened() {
//        Log.e("status", "opened");
//    }
//
//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//    }
//}
