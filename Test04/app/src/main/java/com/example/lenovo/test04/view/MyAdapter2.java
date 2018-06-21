package com.example.lenovo.test04.view;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lenovo.test04.model.MyBean;

import java.util.List;

public class MyAdapter2 extends BaseQuickAdapter<MyBean, BaseViewHolder> {
    public MyAdapter2(int layoutResId, @Nullable List<MyBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyBean item) {

    }
}
