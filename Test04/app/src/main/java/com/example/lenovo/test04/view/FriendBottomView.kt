package com.example.lenovo.test04.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.example.lenovo.test04.R
import com.lcodecore.tkrefreshlayout.IBottomView

class FriendBottomView : FrameLayout, IBottomView {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int?) : this(context, attrs)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    fun init() {
        val view = LayoutInflater.from(context).inflate(R.layout.friend_bottom, this, false)
        addView(view)
    }

    override fun onPullingUp(fraction: Float, maxBottomHeight: Float, bottomHeight: Float) {

    }

    override fun onPullReleasing(fraction: Float, maxBottomHeight: Float, bottomHeight: Float) {

    }

    override fun getView(): View {
        return this
    }


    override fun startAnim(maxBottomHeight: Float, bottomHeight: Float) {

    }

    override fun onFinish() {

    }

    override fun reset() {

    }

}