package com.example.lenovo.test04.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.widget.FrameLayout
import com.example.lenovo.test04.R
import com.lcodecore.tkrefreshlayout.IHeaderView
import com.lcodecore.tkrefreshlayout.OnAnimEndListener
import kotlinx.android.synthetic.main.friend_header_view.view.*

class FriendFragmentHeadView : FrameLayout, IHeaderView {
    /*public HomeRefreshHeadView(@NonNull Context context) {
        this(context, null);
    }

    public HomeRefreshHeadView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeRefreshHeadView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }*/
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : this(context, attrs)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    fun init() {
        val view = LayoutInflater.from(context).inflate(R.layout.friend_header_view, this, false)
        addView(view)
    }

    override fun getView(): View {
        return this
    }

    override fun reset() {
        iv_loading.visibility = View.VISIBLE
    }

    override fun startAnim(maxHeadHeight: Float, headHeight: Float) {
//        RotateAnimation ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        iv_loading.visibility = View.VISIBLE
        val rotateAnimation = RotateAnimation(0f, 359f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotateAnimation.duration = 750
        rotateAnimation.interpolator = LinearInterpolator()
        rotateAnimation.repeatCount = Animation.INFINITE
        iv_loading.startAnimation(rotateAnimation)
//        iv_loading.animate()
//                .rotation(360f)
//                .setListener(object : AnimatorListenerAdapter() {
//                    override fun onAnimationEnd(animation: Animator?) {
//                        super.onAnimationEnd(animation)
//                        animation?.start()
//                    }
//                })
//                .setDuration(600)
//                .start()
    }

    override fun onFinish(animEndListener: OnAnimEndListener?) {
        animEndListener?.onAnimEnd()
        iv_loading.visibility = View.GONE
        iv_loading.clearAnimation()
    }

    override fun onPullingDown(fraction: Float, maxHeadHeight: Float, headHeight: Float) {

    }

    override fun onPullReleasing(fraction: Float, maxHeadHeight: Float, headHeight: Float) {

    }

}