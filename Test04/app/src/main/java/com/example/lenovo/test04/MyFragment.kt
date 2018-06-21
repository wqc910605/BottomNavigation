package com.example.lenovo.test04

class MyFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_my;
    }

    override fun initData() {
        val customDialog = CustomDialog()
        customDialog.show(childFragmentManager, "dialog")
    }

}