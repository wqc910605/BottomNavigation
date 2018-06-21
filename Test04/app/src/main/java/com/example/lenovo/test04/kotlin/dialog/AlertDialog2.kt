package com.example.lenovo.test04.kotlin.dialog

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lenovo.test04.R
class AlertDialog2 : DialogFragment() {
    companion object {
        val TAG = "AlertDialog2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, R.style.MyDialog);
    }

    override fun onStart() {
        super.onStart()
        val window = dialog.window
        window.setGravity(Gravity.LEFT or Gravity.TOP)
        val screenWidth = resources.displayMetrics.widthPixels
        window.setLayout((screenWidth*0.8).toInt(), ViewGroup.LayoutParams.WRAP_CONTENT);
        //设置背景色透明,在style中已设置backgroundDimEnabled为false,这里不需要.
        val windowParams = window.getAttributes();
//        val dp100 = dp2px(100)
//        val dp20 = dp2px(20)
//        Toast.makeText(context, "$dp100, $dp20", Toast.LENGTH_SHORT).show()

//        windowParams.x = dp20
//        windowParams.y = dp100
        windowParams.dimAmount = 0.5f;
        window.setAttributes(windowParams);
        //再次设置出现动画
//        window.getAttributes().windowAnimations = R.style.DialogAnimation;
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.dialog_layout, container, false)
        return view
    }

    fun dp2px(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (density * dp).toInt()
    }

}