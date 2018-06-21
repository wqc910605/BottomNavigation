package com.example.lenovo.test04

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {
//    var mHidden = false//默认不可见
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(getLayoutId(), container, false)
        return view
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("test: onViewCreated")

    }*/

    override fun onResume() {
        super.onResume()
        println("test: onResume")
        initData()
        /*if (!mHidden) {//可见性初始化数据
        }*/
    }

    /*//可见性
    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        this.mHidden = hidden
        println("test:onHiddenChanged: $hidden")
    }*/

    //获取布局id
    abstract fun getLayoutId(): Int

    //初始化数据
    abstract fun initData()
}