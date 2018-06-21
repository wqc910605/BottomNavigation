package com.example.lenovo.test04.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.example.lenovo.test04.*
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(), BottomNavigationBar.OnTabSelectedListener {
    var prevFragment: BaseFragment? = null;
    var fragments = ArrayList<BaseFragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
//        super.onSaveInstanceState(outState)
    }

    private fun initFragment() {

        bottom_navigation_bar.addItem(BottomNavigationItem(R.mipmap.ic_launcher, "首页"))
                .addItem(BottomNavigationItem(R.mipmap.ic_launcher, "朋友"))
                .addItem(BottomNavigationItem(R.mipmap.ic_launcher, "发现"))
                .addItem(BottomNavigationItem(R.mipmap.ic_launcher, "我的"))
                .setActiveColor(R.color.colorAccent)
                .setInActiveColor(R.color.gray)
                .setMode(BottomNavigationBar.MODE_STILL)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STILL)
                .setTabSelectedListener(this)
                .setFirstSelectedPosition(0)
                .initialise()

        fragments.add(HomeFragment())
        fragments.add(FriendFragment())
        fragments.add(FindFragment())
        fragments.add(MyFragment())
        supportFragmentManager.beginTransaction().add(R.id.fl_content, fragments.get(0), "0").commit()
        prevFragment = fragments.get(0)
    }

    //底部导航监听
    override fun onTabReselected(position: Int) {
        println("bottombar: onTabReselected $position")
    }

    override fun onTabUnselected(position: Int) {

    }

    override fun onTabSelected(position: Int) {
        var transaction = supportFragmentManager.beginTransaction()
        //隐藏上一个
        transaction.hide(prevFragment)
        val currFragment = fragments.get(position)
        if (!currFragment.isAdded) {
            transaction.add(R.id.fl_content, currFragment).commit()
        } else {
            transaction.show(currFragment).commit()
        }
        prevFragment = fragments.get(position)
    }
}
