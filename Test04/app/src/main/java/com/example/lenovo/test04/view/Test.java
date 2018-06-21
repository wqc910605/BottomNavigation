package com.example.lenovo.test04.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.example.lenovo.test04.R;
import com.example.lenovo.test04.model.MyBean;

import java.util.ArrayList;
import java.util.List;

public class Test extends DialogFragment{

    private List<MyBean> mDatas;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Window window = getDialog().getWindow();
//        window.setGravity(Gravity.LEFT | Gravity.TOP);
        mDatas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mDatas.add(new MyBean("wwf", 12));
        }
        RecyclerView recyclerView = new RecyclerView(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        recyclerView.setAdapter(new MyAdapter(R.layout.recyclerview_item, mDatas));
        test();
    }

    private void test() {
//        ImageView imageView = new ImageView(getContext());

    }
}
