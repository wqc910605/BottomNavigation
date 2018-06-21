package com.example.lenovo.test04

import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import com.example.lenovo.test04.model.MyBean
import com.example.lenovo.test04.view.FriendBottomView
import com.example.lenovo.test04.view.FriendFragmentHeadView
import com.example.lenovo.test04.view.MyAdapter
import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout
import kotlinx.android.synthetic.main.fragment_friend.*
import java.util.*

class FriendFragment : BaseFragment(){
    private var handler:Handler = Handler()
    private var mDatas:MutableList<MyBean>? = null
    private var myAdapter:MyAdapter? = null
    override fun getLayoutId(): Int {
        return R.layout.fragment_friend;
    }
    override fun initData() {
        mDatas = ArrayList()
        for (i in 1..10) {
            mDatas?.add(MyBean("wwf", 12))
        }
        recyclerview.layoutManager = LinearLayoutManager(context)
        myAdapter = MyAdapter(R.layout.recyclerview_item, mDatas)
        recyclerview.adapter = myAdapter
        val friendFragmentHeadView = FriendFragmentHeadView(context)
//        val layoutParams = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 800)
//        friendFragmentHeadView.layoutParams = layoutParams
        refreshLayout.setMaxHeadHeight(800f)
        refreshLayout.setMaxBottomHeight(800f)
        refreshLayout.setOverScrollHeight(300f)
        refreshLayout.setHeaderView(friendFragmentHeadView)
        refreshLayout.setBottomView(FriendBottomView(context))
        refreshLayout.setOnRefreshListener(object : RefreshListenerAdapter() {
            override fun onLoadMore(refreshLayout: TwinklingRefreshLayout?) {
                super.onLoadMore(refreshLayout)
                handler.postDelayed({
                    for (i in 1..10) {
                        mDatas?.add(MyBean("wwf", 12))
                    }
//                    myAdapter?.notifyDataSetChanged()
                    refreshLayout?.finishLoadmore()
                }, 1500)
            }

            override fun onRefresh(refreshLayout: TwinklingRefreshLayout?) {
                super.onRefresh(refreshLayout)
                handler.postDelayed({
                    mDatas?.clear()
                    for (i in 1..10) {
                        mDatas?.add(MyBean("wwf", 12))
                    }
//                    myAdapter?.notifyDataSetChanged()
                    refreshLayout?.onFinishRefresh()
                }, 1500)
            }
        })
    }

}