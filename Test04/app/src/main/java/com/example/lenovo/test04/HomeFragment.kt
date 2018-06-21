package com.example.lenovo.test04

import android.support.v7.widget.LinearLayoutManager
import com.example.lenovo.test04.model.MyBean
import com.example.lenovo.test04.view.MyAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment(){
    private val mDatas:MutableList<MyBean> = ArrayList()
    override fun getLayoutId(): Int {
        return  R.layout.fragment_home
    }

    override fun initData() {
        for(i in 1..20){
            mDatas.add(MyBean("wwf", 12))
        }
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MyAdapter(R.layout.recyclerview_item,mDatas)
    }

    /*private var mDatas: MutableList<MyBean> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        Window window = getDialog().getWindow();
        //        window.setGravity(Gravity.LEFT | Gravity.TOP);
        mDatas = ArrayList()
        for (i in 0..9) {
            mDatas.add(MyBean())
        }
        val recyclerView = RecyclerView(null)
        recyclerView.layoutManager = LinearLayoutManager(null)
        recyclerView.adapter = MyAdapter(R.layout.recyclerview_item, mDatas)
    }*/

}


